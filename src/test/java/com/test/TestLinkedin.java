package com.test;

import com.microsoft.playwright.*;
import com.microsoft.playwright.junit.UsePlaywright;
public class TestLinkedin {
        public void verifyLinkedin() {
            Playwright pw = Playwright.create();
            Browser bs = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext browserContext = bs.newContext();
            Page page = browserContext.newPage();
            page.navigate("https://www.linkedin.com");
            bs.close();
        }
    }


