import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * 
 */

/**
 * @author PE
 * @date 2019年6月18日 下午4:16:54
 * @explain
 */
public class Log4j2 {
	// 基于类的名称获取日志对象
	static Logger log = Logger.getLogger(Log4j2.class);

	public static void main(String[] args) throws InterruptedException {
		// 指定配置文件
		PropertyConfigurator.configure("D:\\testpro\\Log\\src\\log4j.properties");

		for (int i = 0; i < 5000; i++) {
			log.trace("跟踪信息");
			log.debug("调试信息");
			log.info("输出信息");
			log.warn("警告信息");
			log.error("错误信息");
			log.fatal("致命信息");
		}

	}

}
