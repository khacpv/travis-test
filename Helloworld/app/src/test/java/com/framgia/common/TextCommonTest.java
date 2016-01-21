package com.framgia.common;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertTrue;

/**
 * Created by khacpham on 1/21/16.
 */
public class TextCommonTest {
    TextCommon textCommon;

    @Before
    public void setup() throws Exception{
        textCommon = new TextCommon();
    }

    @Test
    public void checkText_isEmpty() throws Exception {
        assertTrue(textCommon.isEmpty(""));
    }

    @After
    public void clean() throws Exception{
        textCommon = null;
    }
}
