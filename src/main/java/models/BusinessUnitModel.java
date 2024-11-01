package models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class BusinessUnitModel {

    private String business;
    private String unitName;

    public static List<BusinessUnitModel> setData(DataTable table) {
        List<BusinessUnitModel> data = new ArrayList<>();
        List<Map<String, String>> rows = table.asMaps();

        for(Map<String, String> columns : rows) {
            data.add(new ObjectMapper().convertValue(columns, BusinessUnitModel.class));
        }

        return data;
    }

}
