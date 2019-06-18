import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * 
 */

/**
 * @author PE
 * @date 2019年6月18日 下午4:16:54
 * @explain
 */
public class Log4j {
	// 基于类的名称获取日志对象
	static Logger log = Logger.getLogger(Log4j.class);

	public static void main(String[] args) throws InterruptedException {
		// 进行默认配置
		BasicConfigurator.configure();
		// 设置日志输出级别
		log.setLevel(Level.DEBUG);
		// 进行不同级别的日志输出:只输出高于DEBUG级别的，因此TRACE级别的日志自动不输出
		log.trace("跟踪信息");
		log.debug("调试信息");
		log.info("输出信息");
		// 是为了便于观察前后日志输出的时间差
		Thread.sleep(1000);
		log.warn("警告信息");
		log.error("错误信息");
		log.fatal("致命信息");

	}

}
