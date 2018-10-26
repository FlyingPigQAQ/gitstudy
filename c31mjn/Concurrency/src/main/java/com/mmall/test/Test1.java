package com.mmall.test;


public class Test1 {

    public static void main(String[] args) {
        String xml ="<?xml version='1.0' encoding='UTF-8'?>\n" +
                "<BaseInfo>\n" +
                "\t<TransType>KFSXSPT</TransType>\n" +
                "\t<TransCode>KF01</TransCode>\n" +
                "\t<TransDate>2018-10-11</TransDate>\n" +
                "\t<TransTime>21:46:48.222</TransTime>\n" +
                "\t<Output><DATAITEMLIST><FLAG>1</FLAG><XZ>\n" +
                "    <Result0>\n" +
                "      <ContNo>887143219268</ContNo>\n" +
                "      <RiskCode>00178000</RiskCode>\n" +
                "      <RiskName>178 惠福宝两全保险</RiskName>\n" +
                "      <RiskShortName>惠福宝</RiskShortName>\n" +
                "      <Prem>50000</Prem>\n" +
                "      <Amnt>59300</Amnt>\n" +
                "      <PayYears>1000</PayYears>\n" +
                "      <PayCount>1</PayCount>\n" +
                "      <PayIntv>0</PayIntv>\n" +
                "      <SignDate>2013-06-01</SignDate>\n" +
                "      <PaytoDate>3013-06-02</PaytoDate>\n" +
                "    </Result0>\n" +
                "    <Result1>\n" +
                "      <ContNo>887143219268</ContNo>\n" +
                "      <RiskCode>00188000</RiskCode>\n" +
                "      <RiskName>188 V3.5 金彩一生终身年金保险</RiskName>\n" +
                "      <RiskShortName>金彩一生</RiskShortName>\n" +
                "      <Prem>32740</Prem>\n" +
                "      <Amnt>10000</Amnt>\n" +
                "      <PayYears>1000</PayYears>\n" +
                "      <PayCount></PayCount>\n" +
                "      <PayIntv>0</PayIntv>\n" +
                "      <SignDate></SignDate>\n" +
                "      <PaytoDate></PaytoDate>\n" +
                "    </Result1>\n" +
                "    <Result2>\n" +
                "      <ContNo>887143219268</ContNo>\n" +
                "      <RiskCode>00915000</RiskCode>\n" +
                "      <RiskName>915 附加随意领年金保险（万能型）</RiskName>\n" +
                "      <RiskShortName>附加随意领</RiskShortName>\n" +
                "      <Prem>0</Prem>\n" +
                "      <Amnt>0</Amnt>\n" +
                "      <PayYears>1000</PayYears>\n" +
                "      <PayCount></PayCount>\n" +
                "      <PayIntv>0</PayIntv>\n" +
                "      <SignDate></SignDate>\n" +
                "      <PaytoDate></PaytoDate>\n" +
                "    </Result2>\n" +
                "  </XZ><ZH>\n" +
                "    <Result0>\n" +
                "      <ContNo>887143219268</ContNo>\n" +
                "      <NewPayMode>2</NewPayMode>\n" +
                "      <NewAccName>卓欣毅</NewAccName>\n" +
                "      <NewBankName>中国建设银行广州市分行(银联)</NewBankName>\n" +
                "      <NewBankAccNo>5242</NewBankAccNo>\n" +
                "    </Result0>\n" +
                "  </ZH><TBR>\n" +
                "    <Result0>\n" +
                "      <ContNo>887143219268</ContNo>\n" +
                "      <AppntNo>0257836530</AppntNo>\n" +
                "      <AppntName>董**</AppntName>\n" +
                "      <AppntSex>1</AppntSex>\n" +
                "      <AppntSexName>女</AppntSexName>\n" +
                "      <Mobile>1**</Mobile>\n" +
                "      <HomePhone>**</HomePhone>\n" +
                "      <CompanyPhone>**</CompanyPhone>\n" +
                "      <OccupationName>一般办事人员和有关人员（不从事危险工作）</OccupationName>\n" +
                "      <PostalAddress>南**</PostalAddress>\n" +
                "      <ZipCode>050000</ZipCode>\n" +
                "      <AgentCom></AgentCom>\n" +
                "      <AgentName></AgentName>\n" +
                "      <IdType>0</IdType>\n" +
                "      <IdNo>1**</IdNo>\n" +
                "      <Birthday>1974-06-03</Birthday>\n" +
                "    </Result0>\n" +
                "  </TBR><BBXR>\n" +
                "    <Result0>\n" +
                "      <ContNo>887143219268</ContNo>\n" +
                "      <InsuredNo>1813496530</InsuredNo>\n" +
                "      <Name>李**</Name>\n" +
                "      <RelationToAppnt>07</RelationToAppnt>\n" +
                "      <RelationToAppntName>夫妻</RelationToAppntName>\n" +
                "      <Sex>0</Sex>\n" +
                "      <SexName>男</SexName>\n" +
                "      <Mobile>1**</Mobile>\n" +
                "      <HomePhone>**</HomePhone>\n" +
                "      <CompanyPhone>**</CompanyPhone>\n" +
                "      <OccupationName>一般办事人员和有关人员（不从事危险工作）</OccupationName>\n" +
                "      <PostalAddress>南**</PostalAddress>\n" +
                "      <ZipCode>050000</ZipCode>\n" +
                "      <IdType>0</IdType>\n" +
                "      <IdNo>1**</IdNo>\n" +
                "      <BirthDay>1972-10-08</BirthDay>\n" +
                "    </Result0>\n" +
                "  </BBXR><SYR>\n" +
                "    <Result0>\n" +
                "      <ContNo>887143219268</ContNo>\n" +
                "      <Name>郭**</Name>\n" +
                "      <RelationToAppntCode>07</RelationToAppntCode>\n" +
                "      <RelationToAppntName>夫妻</RelationToAppntName>\n" +
                "      <Sex>1</Sex>\n" +
                "      <SexName>女</SexName>\n" +
                "      <IdType>0</IdType>\n" +
                "      <IdNo>1**</IdNo>\n" +
                "      <Phone></Phone>\n" +
                "      <PostalAddress></PostalAddress>\n" +
                "      <ZipCode></ZipCode>\n" +
                "      <Birthday>1974-06-03</Birthday>\n" +
                "      <BnfGrade>1</BnfGrade>\n" +
                "      <BnfLot>100</BnfLot>\n" +
                "      <WorkType></WorkType>\n" +
                "    </Result0>\n" +
                "  </SYR><JF>\n" +
                "    <Result0>\n" +
                "      <ContNo>887143219268</ContNo>\n" +
                "      <tempfeeno>320350003024185</tempfeeno>\n" +
                "      <IncomeNo>1</IncomeNo>\n" +
                "      <IncomeType>个人交费</IncomeType>\n" +
                "      <SumActuPayMoney>10000</SumActuPayMoney>\n" +
                "      <PayIntv>年交</PayIntv>\n" +
                "      <EnterAccDate>2014-07-23</EnterAccDate>\n" +
                "      <PayMode>ZC</PayMode>\n" +
                "      <PayToDate>2015-07-24</PayToDate>\n" +
                "      <PayTimes>1</PayTimes>\n" +
                "    </Result0>\n" +
                "  </JF><LQ>\n" +
                "    <Result0>\n" +
                "      <ContNo>887143219268</ContNo>\n" +
                "      <ActuGetNo>370320001369491</ActuGetNo>\n" +
                "      <DutyCode>690000</DutyCode>\n" +
                "      <GetDutyCode>690040</GetDutyCode>\n" +
                "      <GetDutyKind>YF</GetDutyKind>\n" +
                "      <GetDutyName>福享一生终身责任生存金</GetDutyName>\n" +
                "      <SumGetMoney>2000</SumGetMoney>\n" +
                "      <ShouldDate>2016-03-11</ShouldDate>\n" +
                "      <ConfDate>2016-03-24</ConfDate>\n" +
                "      <ENTERACCDATE>2016-03-24</ENTERACCDATE>\n" +
                "      <GettoDate>2017-03-11</GettoDate>\n" +
                "      <RReportFlag>0</RReportFlag>\n" +
                "    </Result0>\n" +
                "  </LQ><BQ>\n" +
                "    <Result0>\n" +
                "      <ContNo>887143219268</ContNo>\n" +
                "      <EdorAcceptNo>6120140820000133</EdorAcceptNo>\n" +
                "      <AppntNo>a4</AppntNo>\n" +
                "      <RiskCode>00178000</RiskCode>\n" +
                "      <RiskName>178 惠福宝两全保险</RiskName>\n" +
                "      <RiskShortName>惠福宝</RiskShortName>\n" +
                "      <PremToAmnt>59300</PremToAmnt>\n" +
                "      <SumPrem></SumPrem>\n" +
                "      <PayToDate>3013-06-02</PayToDate>\n" +
                "      <PayEndDate>1000</PayEndDate>\n" +
                "      <PayTimes></PayTimes>\n" +
                "      <EdorType>CT</EdorType>\n" +
                "      <EdorName>解除合同</EdorName>\n" +
                "      <EdorAppDate>2014-08-20</EdorAppDate>\n" +
                "      <EdorValiDate>2014-08-30</EdorValiDate>\n" +
                "      <EdorState>0</EdorState>\n" +
                "      <Operator>ydbq</Operator>\n" +
                "    </Result0>\n" +
                "    <Result1>\n" +
                "      <ContNo>887143219268</ContNo>\n" +
                "      <EdorAcceptNo>6120140820000133</EdorAcceptNo>\n" +
                "      <AppntNo>rr</AppntNo>\n" +
                "      <RiskCode>00188000</RiskCode>\n" +
                "      <RiskName>188 V3.5 金彩一生终身年金保险</RiskName>\n" +
                "      <RiskShortName>金彩一生</RiskShortName>\n" +
                "      <PremToAmnt>10000</PremToAmnt>\n" +
                "      <SumPrem></SumPrem>\n" +
                "      <PayToDate></PayToDate>\n" +
                "      <PayEndDate>1000</PayEndDate>\n" +
                "      <PayTimes></PayTimes>\n" +
                "      <EdorType>CT</EdorType>\n" +
                "      <EdorName>解除合同</EdorName>\n" +
                "      <EdorAppDate>2014-08-20</EdorAppDate>\n" +
                "      <EdorValiDate>2014-08-30</EdorValiDate>\n" +
                "      <EdorState>0</EdorState>\n" +
                "      <Operator>ydbq</Operator>\n" +
                "    </Result1>\n" +
                "    <Result2>\n" +
                "      <ContNo>887143219268</ContNo>\n" +
                "      <EdorAcceptNo>6120140820000133</EdorAcceptNo>\n" +
                "      <AppntNo>rr</AppntNo>\n" +
                "      <RiskCode>00915000</RiskCode>\n" +
                "      <RiskName>915 附加随意领年金保险（万能型）</RiskName>\n" +
                "      <RiskShortName>附加随意领</RiskShortName>\n" +
                "      <PremToAmnt>0</PremToAmnt>\n" +
                "      <SumPrem></SumPrem>\n" +
                "      <PayToDate></PayToDate>\n" +
                "      <PayEndDate>1000</PayEndDate>\n" +
                "      <PayTimes></PayTimes>\n" +
                "      <EdorType>CT</EdorType>\n" +
                "      <EdorName>解除合同</EdorName>\n" +
                "      <EdorAppDate>2014-08-20</EdorAppDate>\n" +
                "      <EdorValiDate>2014-08-30</EdorValiDate>\n" +
                "      <EdorState>0</EdorState>\n" +
                "      <Operator>ydbq</Operator>\n" +
                "    </Result2>\n" +
                "  </BQ><FWRYGJ>\n" +
                "    <Result0>\n" +
                "      <ContNo>887143219268</ContNo>\n" +
                "      <AgentCode>36557158</AgentCode>\n" +
                "      <AgentName>熊淑芬</AgentName>\n" +
                "      <StartDate>2015-03-01</StartDate>\n" +
                "      <EndDate></EndDate>\n" +
                "      <AreaCode></AreaCode>\n" +
                "      <AreaName></AreaName>\n" +
                "      <DepartCode>761001</DepartCode>\n" +
                "      <CodeName>郭风卿部</CodeName>\n" +
                "      <GroupCode>761001001</GroupCode>\n" +
                "      <GroupName>部经理郭风卿组</GroupName>\n" +
                "    </Result0>\n" +
                "  </FWRYGJ><LPGJ>\n" +
                "    <Result0>\n" +
                "      <ClmNo>HBx12003010ss0</ClmNo>\n" +
                "      <ContNo>887143219268</ContNo>\n" +
                "      <AppntNo>001206372</AppntNo>\n" +
                "      <AppntName>卓欣毅</AppntName>\n" +
                "      <RiskCode>00701000</RiskCode>\n" +
                "      <RiskName>701 v2.0 健乐增额终身重大疾病保险 (分红型)</RiskName>\n" +
                "      <RiskShortName>健乐终身重疾</RiskShortName>\n" +
                "      <PayToDate></PayToDate>\n" +
                "      <MakeDate></MakeDate>\n" +
                "      <RgtDate>2005-05-31</RgtDate>\n" +
                "      <EndCaseDate>2005-05-31</EndCaseDate>\n" +
                "      <ClmState>60</ClmState>\n" +
                "      <ClmStateName>完成</ClmStateName>\n" +
                "      <RealPay></RealPay>\n" +
                "      <CustomerName></CustomerName>\n" +
                "      <PayFlag>否</PayFlag>\n" +
                "    </Result0>\n" +
                "  </LPGJ><HL>\n" +
                "    <Result0>\n" +
                "      <ContNo>887143219268</ContNo>\n" +
                "      <PolNo>210320001957172</PolNo>\n" +
                "      <RiskCode></RiskCode>\n" +
                "      <DutyCode>000000</DutyCode>\n" +
                "      <DutyName></DutyName>\n" +
                "      <FisCalYear>2007</FisCalYear>\n" +
                "      <BonusNo>0</BonusNo>\n" +
                "      <BonusType>年度红利</BonusType>\n" +
                "      <BonusRate>0.009</BonusRate>\n" +
                "      <TerminalBonusRate>0</TerminalBonusRate>\n" +
                "      <BaseAmnt>86285</BaseAmnt>\n" +
                "      <SumBonusAmnt>0</SumBonusAmnt>\n" +
                "      <BonusAmnt>776.57</BonusAmnt>\n" +
                "      <AvailableAmnt>87061.57</AvailableAmnt>\n" +
                "      <BonusMakeDate>2008-06-07</BonusMakeDate>\n" +
                "      <SDispatchDate>2008-01-13</SDispatchDate>\n" +
                "      <ADispatchDate>2008-06-07</ADispatchDate>\n" +
                "    </Result0>\n" +
                "    <Result1>\n" +
                "      <ContNo>887143219268</ContNo>\n" +
                "      <PolNo>210320001957172</PolNo>\n" +
                "      <RiskCode></RiskCode>\n" +
                "      <DutyCode>000000</DutyCode>\n" +
                "      <DutyName></DutyName>\n" +
                "      <FisCalYear>2007</FisCalYear>\n" +
                "      <BonusNo>1</BonusNo>\n" +
                "      <BonusType>基本保额特别红利</BonusType>\n" +
                "      <BonusRate>0.001</BonusRate>\n" +
                "      <TerminalBonusRate>0</TerminalBonusRate>\n" +
                "      <BaseAmnt>86285</BaseAmnt>\n" +
                "      <SumBonusAmnt>776.57</SumBonusAmnt>\n" +
                "      <BonusAmnt>86.29</BonusAmnt>\n" +
                "      <AvailableAmnt>87147.85</AvailableAmnt>\n" +
                "      <BonusMakeDate>2007-10-07</BonusMakeDate>\n" +
                "      <SDispatchDate>2008-01-13</SDispatchDate>\n" +
                "      <ADispatchDate>2008-06-07</ADispatchDate>\n" +
                "    </Result1>\n" +
                "    <Result2>\n" +
                "      <ContNo>887143219268</ContNo>\n" +
                "      <PolNo>210320001957172</PolNo>\n" +
                "      <RiskCode></RiskCode>\n" +
                "      <DutyCode>000000</DutyCode>\n" +
                "      <DutyName></DutyName>\n" +
                "      <FisCalYear>2012</FisCalYear>\n" +
                "      <BonusNo>0</BonusNo>\n" +
                "      <BonusType>年度红利</BonusType>\n" +
                "      <BonusRate>0.006</BonusRate>\n" +
                "      <TerminalBonusRate>0.004</TerminalBonusRate>\n" +
                "      <BaseAmnt>86285</BaseAmnt>\n" +
                "      <SumBonusAmnt>862.86</SumBonusAmnt>\n" +
                "      <BonusAmnt>544.14</BonusAmnt>\n" +
                "      <AvailableAmnt>91233.62</AvailableAmnt>\n" +
                "      <BonusMakeDate>2013-06-22</BonusMakeDate>\n" +
                "      <SDispatchDate>2013-01-13</SDispatchDate>\n" +
                "      <ADispatchDate>2013-06-22</ADispatchDate>\n" +
                "    </Result2>\n" +
                "  </HL></DATAITEMLIST></Output>\n" +
                "</BaseInfo>";
        String s = xml.replaceAll("<Result\\d*>", "<Result>");
        s= s.replaceAll("</Result\\d*>", "</Result>");
        System.out.println(s);
    }
}
