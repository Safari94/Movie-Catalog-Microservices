package io.safari94.ratingdataservice.resources;


import io.safari94.ratingdataservice.models.Rating;
import io.safari94.ratingdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return  new Rating(movieId,9.9);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){

       List<Rating> ratings =Arrays.asList(
                new Rating("1",6.7),
                new Rating("2",3.4),
                new Rating("3",8.1)

                );

       UserRating userRating = new UserRating();
       userRating.setUserRating(ratings);

       return userRating;
    }


}
