package agh.edu.pl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class EngineController {


    @RequestMapping(value = "/find/{from}/{to}", method = RequestMethod.GET)
    public FlightDetails findBestFlight(@PathVariable  String from,@PathVariable String to) {

        RestTemplate restTemplate = new RestTemplate();

        FlightDetailsDTO flightDetailsDTO = restTemplate.getForObject("http://flight-service/find/" + from + "/" + to, FlightDetailsDTO.class);
        ResponseEntity<Price[]> response = restTemplate.getForEntity("http://currency-service/convert-euro/"+flightDetailsDTO.getPriceInEuro().toString(), Price[].class);

        List<Price> priceList = Arrays.asList(response.getBody());

        FlightDetails flightDetails = new FlightDetails();
        flightDetails.setFrom(from);
        flightDetails.setTo(to);
        flightDetails.setFromDate(flightDetailsDTO.getFromDate());
        flightDetails.setToDate(flightDetailsDTO.getToDate());
        flightDetails.setPriceList(priceList);

        return flightDetails;
    }


}
