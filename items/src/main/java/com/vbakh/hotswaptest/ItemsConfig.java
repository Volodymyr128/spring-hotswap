package com.vbakh.hotswaptest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 * Created by volodymyr.bakhmatiuk on 5/10/18.
 */
@Import(CoreConfig.class)
@EnableAutoConfiguration
public class ItemsConfig {
}
