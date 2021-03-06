/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.robotframework;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class RobotFrameworkEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        RobotFrameworkEndpoint target = (RobotFrameworkEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "argumentfile":
        case "argumentFile": target.getConfiguration().setArgumentFile(property(camelContext, java.io.File.class, value)); return true;
        case "combinedtagstats":
        case "combinedTagStats": target.getConfiguration().setCombinedTagStats(property(camelContext, java.lang.String.class, value)); return true;
        case "contentcache":
        case "contentCache": target.setContentCache(property(camelContext, boolean.class, value)); return true;
        case "criticaltags":
        case "criticalTags": target.getConfiguration().setCriticalTags(property(camelContext, java.lang.String.class, value)); return true;
        case "debugfile":
        case "debugFile": target.getConfiguration().setDebugFile(property(camelContext, java.io.File.class, value)); return true;
        case "document": target.getConfiguration().setDocument(property(camelContext, java.lang.String.class, value)); return true;
        case "dryrun": target.getConfiguration().setDryrun(property(camelContext, boolean.class, value)); return true;
        case "excludes": target.getConfiguration().setExcludes(property(camelContext, java.lang.String.class, value)); return true;
        case "exitonfailure":
        case "exitOnFailure": target.getConfiguration().setExitOnFailure(property(camelContext, boolean.class, value)); return true;
        case "includes": target.getConfiguration().setIncludes(property(camelContext, java.lang.String.class, value)); return true;
        case "listener": target.getConfiguration().setListener(property(camelContext, java.lang.String.class, value)); return true;
        case "listeners": target.getConfiguration().setListeners(property(camelContext, java.lang.String.class, value)); return true;
        case "log": target.getConfiguration().setLog(property(camelContext, java.io.File.class, value)); return true;
        case "loglevel":
        case "logLevel": target.getConfiguration().setLogLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "logtitle":
        case "logTitle": target.getConfiguration().setLogTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "metadata": target.getConfiguration().setMetadata(property(camelContext, java.lang.String.class, value)); return true;
        case "monitorcolors":
        case "monitorColors": target.getConfiguration().setMonitorColors(property(camelContext, java.lang.String.class, value)); return true;
        case "monitorwidth":
        case "monitorWidth": target.getConfiguration().setMonitorWidth(property(camelContext, java.lang.String.class, value)); return true;
        case "name": target.getConfiguration().setName(property(camelContext, java.lang.String.class, value)); return true;
        case "noncriticaltags":
        case "nonCriticalTags": target.getConfiguration().setNonCriticalTags(property(camelContext, java.lang.String.class, value)); return true;
        case "nostatusreturncode":
        case "noStatusReturnCode": target.getConfiguration().setNoStatusReturnCode(property(camelContext, boolean.class, value)); return true;
        case "output": target.getConfiguration().setOutput(property(camelContext, java.io.File.class, value)); return true;
        case "outputdirectory":
        case "outputDirectory": target.getConfiguration().setOutputDirectory(property(camelContext, java.io.File.class, value)); return true;
        case "randomize": target.getConfiguration().setRandomize(property(camelContext, java.lang.String.class, value)); return true;
        case "report": target.getConfiguration().setReport(property(camelContext, java.io.File.class, value)); return true;
        case "reportbackground":
        case "reportBackground": target.getConfiguration().setReportBackground(property(camelContext, java.lang.String.class, value)); return true;
        case "reporttitle":
        case "reportTitle": target.getConfiguration().setReportTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "runemptysuite":
        case "runEmptySuite": target.getConfiguration().setRunEmptySuite(property(camelContext, boolean.class, value)); return true;
        case "runfailed":
        case "runFailed": target.getConfiguration().setRunFailed(property(camelContext, java.io.File.class, value)); return true;
        case "runmode":
        case "runMode": target.getConfiguration().setRunMode(property(camelContext, java.lang.String.class, value)); return true;
        case "skipteardownonexit":
        case "skipTeardownOnExit": target.getConfiguration().setSkipTeardownOnExit(property(camelContext, boolean.class, value)); return true;
        case "splitoutputs":
        case "splitOutputs": target.getConfiguration().setSplitOutputs(property(camelContext, java.lang.String.class, value)); return true;
        case "suites": target.getConfiguration().setSuites(property(camelContext, java.lang.String.class, value)); return true;
        case "suitestatlevel":
        case "suiteStatLevel": target.getConfiguration().setSuiteStatLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "summarytitle":
        case "summaryTitle": target.getConfiguration().setSummaryTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "tagdocs":
        case "tagDocs": target.getConfiguration().setTagDocs(property(camelContext, java.lang.String.class, value)); return true;
        case "tags": target.getConfiguration().setTags(property(camelContext, java.lang.String.class, value)); return true;
        case "tagstatexcludes":
        case "tagStatExcludes": target.getConfiguration().setTagStatExcludes(property(camelContext, java.lang.String.class, value)); return true;
        case "tagstatincludes":
        case "tagStatIncludes": target.getConfiguration().setTagStatIncludes(property(camelContext, java.lang.String.class, value)); return true;
        case "tagstatlinks":
        case "tagStatLinks": target.getConfiguration().setTagStatLinks(property(camelContext, java.lang.String.class, value)); return true;
        case "tests": target.getConfiguration().setTests(property(camelContext, java.lang.String.class, value)); return true;
        case "timestampoutputs":
        case "timestampOutputs": target.getConfiguration().setTimestampOutputs(property(camelContext, boolean.class, value)); return true;
        case "variablefiles":
        case "variableFiles": target.getConfiguration().setVariableFiles(property(camelContext, java.lang.String.class, value)); return true;
        case "variables": target.getConfiguration().setVariables(property(camelContext, java.lang.String.class, value)); return true;
        case "warnonskippedfiles":
        case "warnOnSkippedFiles": target.getConfiguration().setWarnOnSkippedFiles(property(camelContext, boolean.class, value)); return true;
        case "xunitfile":
        case "xunitFile": target.getConfiguration().setXunitFile(property(camelContext, java.io.File.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

