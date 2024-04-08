package com.alvarx4z.woja;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestUtil {

    public static String getJSONFixture(String path) throws IOException {
        return TestUtil.prettifyJson(
            new String(
                Files.readAllBytes(Paths.get(path))
            )
        );
    }

    public static String prettifyJson(String uglyJsonString) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        Object jsonObject = mapper.readValue(uglyJsonString, Object.class);
        return mapper.writeValueAsString(jsonObject);
    }
}
