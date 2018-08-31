package com.cxb.mydubbo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 81046 on 2018-08-31
 */
public class DubboServiceImpl  implements DubboService{

    @Override
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
