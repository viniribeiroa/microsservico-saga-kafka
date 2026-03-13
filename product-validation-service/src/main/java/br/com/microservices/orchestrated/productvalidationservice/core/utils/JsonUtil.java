package br.com.microservices.orchestrated.productvalidationservice.core.utils;


import br.com.microservices.orchestrated.productvalidationservice.core.dto.Event;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Criado por VINICIUS em 12/03/2026
 * base_files
 */
@Slf4j
@Component
@AllArgsConstructor
public class JsonUtil {


    private final ObjectMapper objectMapper;

    public String toJson(Object object){

        try{
            return objectMapper.writeValueAsString(object);
        }catch (JsonProcessingException e){
            log.error("Falha ao converter objeto para JSON: {}", e.getMessage(), e);
            return null;
        }
    }

    public Event toEvent(String json){
        try {
            return objectMapper.readValue(json, Event.class);
        }catch (Exception e){
            return null;
        }
    }
}
