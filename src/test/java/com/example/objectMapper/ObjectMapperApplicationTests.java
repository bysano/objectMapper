package com.example.objectMapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ObjectMapperApplicationTests {

	private static final Logger LOG = LoggerFactory.getLogger(ObjectMapperApplicationTests.class);

	@Test
	public void contextLoads() {
	}
	@Test
	public void creatingEntityFromYaml() {
		List<Entity> entityList;
//		String workflowStepsYamlFilePath = "entity.yaml";
//		URL resourceURL = getClass().getClassLoader().getResource(workflowStepsYamlFilePath);
		try{
		if (resourceURL == null) {
			throw new IllegalArgumentException("File not found by path " + workflowStepsYamlFilePath);
		}
		File entityFile = new File(resourceURL.getFile());
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		CollectionType workflowStepsType = mapper.getTypeFactory().constructCollectionType(List.class, Entity.class);
		entityList=mapper.readValue(entityFile,workflowStepsType);
	} catch (IOException e) {
		throw new IllegalArgumentException("Could not get ServiceTemplate from file", e);
	}
	LOG.info("returned entity {}",entityList);
	}

}
