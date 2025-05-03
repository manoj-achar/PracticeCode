package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> tableList = Arrays.asList("Call ExecutableRestartOperations",
"patch_jobdetails",
"patch_downloads",
"imstaskagentdetails",
"Call Escalation_Info",
"Call GetGenericNotificationUserDetails",
"servicedesk_smsdetails",
"genericnotification_userids_mailids",
"escalation_userids",
"Call Escalation_Info",
"Call PERFORMANCE",
"call Convert_InventoryDetails_To_Asset",
"call NodeReconciliation",
"resourceoperation",
"Submit_Ticket",
"sd_servicereqmaster",
"Call BaselineCalculater",
"addm_dependentinfo",
"CALL OUandMasterAgentMapper",
"Call Populate_Software_Meter_Frequency",
"agenttimerprofilemappingmaster",
"call NodeReconciliation",
"agenttimerprofilemappingmaster",
"updateagentdetails",
"perfinstance_collectiondetails",
"loganalyzer_otherinputsettings",
"call populateuserformpublishinfo",
"call Postpatchdeploy",
"Call pm_submitschedulejobs",
"call populateuserformpublishinfo",
"softwaremeterdetail",
"call postsoftwaredeploymentjob",
"updateagentdetails",
"call Postpatchdeploy",
"Call pm_submitschedulejobs",
"call populateuserformpublishinfo",
"perfinstance_collectiondetails",
"call Postpatchdeploy",
"call populateuserformpublishinfo");
        
        tableList.stream().distinct().forEach(System.out::println);
    }
}