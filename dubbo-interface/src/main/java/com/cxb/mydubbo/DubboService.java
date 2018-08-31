package com.cxb.mydubbo;

import java.util.List;

/**
 * Created by 81046 on 2018-08-31
 */
public interface DubboService {
    List<String> getPermissions(Long id);
}
