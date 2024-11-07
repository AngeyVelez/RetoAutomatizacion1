package models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class LoginLombok {
    private String username;
    private String password;

    public static List<LoginLombok> setData(DataTable table) {
        List<LoginLombok> data = new ArrayList<>();
        List<Map<String, String>> rows = table.asMaps();

        for(Map<String, String> columns : rows) {
            data.add(new ObjectMapper().convertValue(columns, LoginLombok.class));
        }

        return data;
    }

}
