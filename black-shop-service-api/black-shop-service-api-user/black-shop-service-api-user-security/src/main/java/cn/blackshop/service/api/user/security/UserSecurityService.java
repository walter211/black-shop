/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.service.api.user.security;

/**  

* <p>Title: UserSecurityService</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2018年12月11日  

*/
public interface UserSecurityService {

	abstract String UserAuthentication(String userName);
}
