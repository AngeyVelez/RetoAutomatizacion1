package models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class BusinessUnitLombok {

    private String business;
    private String unitName;

    public static List<BusinessUnitLombok> setData(DataTable table) {
        List<BusinessUnitLombok> data = new ArrayList<>();
        List<Map<String, String>> rows = table.asMaps();

        for(Map<String, String> columns : rows) {
            data.add(new ObjectMapper().convertValue(columns, BusinessUnitLombok.class));
        }

        return data;
    }

}
