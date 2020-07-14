
package rental.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="Payment", url="http://localhost:8085")
//@FeignClient(name="Payment", url="http://Payment:8080")
public interface PaymentService {

    @RequestMapping(method= RequestMethod.POST, path="/payments")
    public void approval(@RequestBody Payment payment);

    @RequestMapping(method= RequestMethod.PUT, path="/payments")
    public void approvalCancel(@RequestBody Payment payment);

}