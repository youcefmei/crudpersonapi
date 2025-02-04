package fr.afpa.pompey.cda.springbootapi;

import fr.afpa.pompey.cda.springbootapi.controller.PersonController;
import fr.afpa.pompey.cda.springbootapi.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = PersonController.class)
public class PersonControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private PersonService personService;


    @Test
    public void getPersonTest() throws Exception {
        mockMvc.perform(get("/persons")).andExpect(status().isOk());
    }
}
