import com.example.world.service.WorldService;

// bbb --> aaa
module com.example.bbb {
	requires com.example.aaa;
	uses WorldService;
}