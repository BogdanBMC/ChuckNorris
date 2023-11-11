package practice.bogdan.chucknorris.services;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImplementation implements JokerService{


   private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImplementation() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }


    @Override
    public String getJoke() {
      return chuckNorrisQuotes.getRandomQuote();
    }
}
