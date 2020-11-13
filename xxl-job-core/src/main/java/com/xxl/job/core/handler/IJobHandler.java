package com.xxl.job.core.handler;

/**
 *
 *  封这一层的目的就是执行不同 类型的任务
 *
 *  bean任务反射调用即可 脚本引擎
 *
 * @author xuxueli 2015-12-19 19:06:38
 */
public abstract class IJobHandler {


	/**
	 * execute handler, invoked when executor receives a scheduling request
	 *
	 * @throws Exception
	 */
	public abstract void execute() throws Exception;


	/*@Deprecated
	public abstract ReturnT<String> execute(String param) throws Exception;*/

	/**
	 * init handler, invoked when JobThread init
	 */
	public void init() throws Exception {
		// do something
	}


	/**
	 * destroy handler, invoked when JobThread destroy
	 */
	public void destroy() throws Exception {
		// do something
	}


}
