import com.example.world.service.WorldService;
import com.example.world.service.business.StandardWorldService;

module com.example.aaa {
	exports com.example.world.domain;
	exports com.example.world.service;
	provides WorldService with StandardWorldService;
}