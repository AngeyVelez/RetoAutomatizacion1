package models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class MeetingLombok {

    private String name;
    private String type;
    private String number;
    private String startDate;
    private String endDate;
    private String location;
    private String businessUnit;
    private String organizedBy;
    private String reporter;

    public static List<MeetingLombok> setData(DataTable table) {
        List<MeetingLombok> data = new ArrayList<>();
        List<Map<String, String>> rows = table.asMaps();

        for(Map<String, String> columns : rows) {
            data.add(new ObjectMapper().convertValue(columns, MeetingLombok.class));
        }

        return data;
    }

}
