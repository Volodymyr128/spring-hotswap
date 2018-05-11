package com.vbakh.hotswaptest.service;

import com.vbakh.hotswaptest.domain.Item;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

/**
 * Created by volodymyr.bakhmatiuk on 5/10/18.
 */
@Service
public class ItemService {

    public List<Item> getAll() {
        return Arrays.asList(
                new Item(1L, "First"),
                new Item(2L, "Second"),
                new Item(3L, "Third")
        );
    }
}
