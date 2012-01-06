package be.jeffreyvanmulem.service.impl;

import be.jeffreyvanmulem.service.MovieService;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: Jeffrey
 * Date: 06/01/12
 * Time: 12:52
 * To change this template use File | Settings | File Templates.
 */
@Service
public class MovieServiceImpl implements MovieService {

    public String testUserService() {
        return "this is a test for the movieService";
    }
}
