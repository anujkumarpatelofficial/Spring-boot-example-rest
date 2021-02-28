package com.anuj.org.controller.v1;

import com.anuj.org.model.BaseRequest;
import com.anuj.org.model.BaseResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(Welcome.VERSION)
public class Welcome {

    public static final String VERSION = "v1";
    private static final String PING = VERSION+"/ping";
    private static final String TEST = VERSION+"/test";
    private static final String TEST_DB = VERSION+"/db";


    @RequestMapping(PING)
    public BaseResponse ping(){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setVersion(VERSION);
        baseResponse.setMessage("Success");
        baseResponse.setStatus("200");
        return baseResponse;
    }

    @PostMapping(TEST)
    public BaseResponse getMessage(@RequestBody BaseRequest request){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setMessage(request.getMessageId()+" : "+request.getConversationId());
        baseResponse.setStatus("200");
        return baseResponse;
    }

    @PostMapping(TEST_DB)
    public BaseResponse testDB(@RequestBody BaseRequest request){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setMessage("DB status "+ request.getMessageId()+" : "+request.getConversationId());
        baseResponse.setStatus("200");
        return baseResponse;
    }
}
