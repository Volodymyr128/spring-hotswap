package com.vbakh.hotswaptest.rest;

import com.vbakh.hotswaptest.domain.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

/**
 * Created by volodymyr.bakhmatiuk on 5/10/18.
 */
@RestController("item")
public class Controller {

    @GetMapping
    public List<Item> getAllItems() {
        return Arrays.asList(
            new Item(1L, "First"),
            new Item(2L, "Second"),
            new Item(3L, "Third"),
            new Item(3L, "Fourth")
        );
    }
}
