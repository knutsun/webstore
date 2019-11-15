package com.store;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class DashboardControllerTest {

    @Test
    public void testDashboardPage() throws Exception {
        DashboardController controller = new DashboardController();
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/dash"))
                .andExpect(view().name("dashboard"));
    }

}
