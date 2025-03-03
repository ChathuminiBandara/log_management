package lk.ijse.log_management.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/log")
    String getLog(){
        logger.info("Info log : ");
        logger.warn("Warn log : ");
        logger.error("Error log : ");
        logger.debug("{} Debug log : ","Hello");


        try{
            throw new RuntimeException("Exception log : ");
        } catch (RuntimeException e) {
            logger.error("You have RuntimeException log : {} ", e.getMessage());
        }
        return "Log Message Generated !";
    }
}
