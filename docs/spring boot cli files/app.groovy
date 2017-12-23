@RestController
class IndexController{
	
	@RequestMapping("/")
	public String index(){
		return "hello world!";
	}
}