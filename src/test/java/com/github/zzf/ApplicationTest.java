package com.github.zzf;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.BDDAssertions.then;

@Slf4j
@SpringBootTest
public class ApplicationTest {

    @Test
    public void givenOne_whenEqualToOne_thenSuccess() {
        then(1).isEqualTo(1);
    }

}
