public class ReportService {

    public String export(ReportFormatter reportFormatter, Report data){
        return reportFormatter.format(data);
    }
}
