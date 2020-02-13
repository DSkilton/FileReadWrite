/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfile;

/**
 *
 * @author MC03353
 */
public class GetAndSet {
        //instance variables
    String _FirstName, _SecondName, _Reference, _BusinessType, _sInternationalCalls, _Date, _Month, _Search, _ReadFrom;
    int _ContractLength, _BusinessAdjustment, _IntCallsAdjustment, _CostPerMonth, _TotalPolicies, _HighUnlimited, _Package, _DataBundle;
    Boolean _InternationalCalls;

    public GetAndSet() {
    _Month = "";
    _Date = "";
    _FirstName = "";
    _SecondName = "";
    _Reference = "";
    _BusinessType = "";
    _DataBundle = 0;
    _Package = 0;
    _ContractLength = 0;
    _InternationalCalls = false;
    _sInternationalCalls = "No";
    _BusinessAdjustment = 0;
    _IntCallsAdjustment = 0;
    _CostPerMonth = 0;
    _TotalPolicies = 0;
    _HighUnlimited = 0;
    
    }// end of Constructors
    
    public String getReadFrom(){
        return _ReadFrom;
    }
    public void setReadFrom(String ReadFrom){
        this._ReadFrom = ReadFrom;
    }
    
    public String getSearch(){
        return _Search;
    }
    public void setSearch(String Search){
        this._Search = Search;
    }
    
    public String getMonth(){
        return _Month;
    }
    public void setMonth(String Month){
        this._Month = Month;
    }
    
    public int getDataBundle() {
        return _DataBundle;
    }
    public void setDataBundle(int DataBundle) {
        this._DataBundle = DataBundle;
    }
    
    public int getPackage() {
        return _Package;
    }
    public void setPackage(int Package) {
        this._Package = Package;
    }
    
    public int getHighUnlimited(){
        return _HighUnlimited;
    }
    public void setHighUnlimited(int HighUnlimited){
        this._HighUnlimited = HighUnlimited;
    }
    
    public int getTotalPolicies(){
        return _TotalPolicies;
    }
    public void setTotalPolicies(int TotalPolicies){
        this._TotalPolicies = TotalPolicies;
    }
    
    public int getCostPerMonth(){
        return _CostPerMonth;
    }
    public void setCostPerMonth(int CostPerMonth){
        this._CostPerMonth = CostPerMonth;
    }
    
    public int getBusinessAdjustment(){
        return _BusinessAdjustment;
    }
    public void setBusinessAdjustment(int BusinessAdjustment){
        this._BusinessAdjustment = BusinessAdjustment;
    }

    public String businessAdjustment;{
        if (businessAdjustment != ""){
        System.out.print(_BusinessAdjustment);
        }
    };

    public int getIntCallsAdjustment(){
        return _IntCallsAdjustment;
    }
    public void setIntCallsAdjustment(int IntCallsAdjustment){
        this._IntCallsAdjustment = IntCallsAdjustment;
    }

    public boolean getInternationalCalls(){
        return _InternationalCalls;
    }
    public void setInternationalCalls(Boolean InternationalCalls){
        this._InternationalCalls = InternationalCalls;
    }

    public void setsInternationalCalls(String sInternationalCalls){
        this._sInternationalCalls = sInternationalCalls;
    }
    public String getsInternationallCalls(){
        return _sInternationalCalls;
    }

    public String getDate(){
        return _Date;
    }
    public void setDate(String Date){
        this._Date = Date;
    }

    public String getReference(){
        return _Reference;
    }
    public void setReference(String Reference){
        this._Reference = Reference;
    }

    public String getBusinessType(){
        return _BusinessType;
    }
    public void setBusinessType(String BusinessType){
        this._BusinessType = BusinessType;
    }

    public String getFirstName(){
        return _FirstName;
    }
    public void setFirstName(String FirstName){
        this._FirstName = FirstName;
    }

    public String getSecondName(){
        return _SecondName;
    }
    public void setSecondName(String SecondName){
        this._SecondName = SecondName;
    }

    public int getContractLength(){
        return _ContractLength;
    }
    public void setContractLength(int ContractLength){
        this._ContractLength = ContractLength;
    }   
}