package pl.akademiakodu.jokes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {


    /*
    po adresie url:
    localhost8080/ prechodzi do metody generateJokes()
    ModelMap sluzy do przekazania danych z Kontrolera do widoku html
    jesli piszemy map.put("name","Michał");
    ro  w html bedzie widoczna zmienna name ktora wartosci bedzie michal
     */

    @GetMapping("/")
    public String generateJoke(ModelMap map){

        ChuckNorrisQuotes chuckNorrisQuotes=new ChuckNorrisQuotes();
        map.put("quote",chuckNorrisQuotes.getRandomQuote());
        return "joke";// przejd do pliku: resources/tamplates/joke.html

    }
}
