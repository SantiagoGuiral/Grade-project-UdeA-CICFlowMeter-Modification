package cic.cs.unb.ca.flow;

import cic.cs.unb.ca.Sys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;


public class FlowMgr {

    protected static final Logger logger = LoggerFactory.getLogger(FlowMgr.class);

    public static final String FLOW_SUFFIX = "_Flow.csv";

    private static FlowMgr Instance = new FlowMgr();

    private String mFlowSavePath;
    private String mDataPath;

    private FlowMgr() {
        super();
    }
    
    public static FlowMgr getInstance() {
        return Instance;
    }

    public FlowMgr init() {

        String rootPath = System.getProperty("user.dir");
		StringBuilder sb = new StringBuilder(rootPath);
		sb.append(Sys.FILE_SEP).append("data").append(Sys.FILE_SEP);

		mDataPath = sb.toString();

        sb.append("records").append(Sys.FILE_SEP);                                                                      //SRG
        mFlowSavePath = sb.toString();

        return Instance;
    }

    public void destroy() {
    }

	public String getSavePath() {
		return mFlowSavePath;
	}

    public String getmDataPath() {
        return mDataPath;
    }

    public String getAutoSaveFile() {
        String filename = LocalDate.now()+FLOW_SUFFIX;
		return mFlowSavePath+filename;
	}
}
