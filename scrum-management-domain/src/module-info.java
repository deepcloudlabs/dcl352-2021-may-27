import com.example.scrum.api.ScrumService;
import com.example.scrum.api.business.StandardScrumService;

module com.example.scrum {
	exports com.example.scrum.domain;
	exports com.example.scrum.event;
	exports com.example.scrum.repository; // spi
	exports com.example.scrum.infra; // spi
	exports com.example.scrum.api; // api
	provides ScrumService with StandardScrumService;
}