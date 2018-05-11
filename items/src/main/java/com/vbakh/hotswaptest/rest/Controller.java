package com.vbakh.hotswaptest.rest;

import com.vbakh.hotswaptest.domain.Item;
import com.vbakh.hotswaptest.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by volodymyr.bakhmatiuk on 5/10/18.
 */
@RestController("item")
public class Controller {

    @Resource
    private ItemService itemService;

    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAll();
    }
}
