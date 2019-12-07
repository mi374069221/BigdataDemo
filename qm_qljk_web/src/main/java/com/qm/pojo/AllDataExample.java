package com.qm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AllDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AllDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andNodeipIsNull() {
            addCriterion("nodeIp is null");
            return (Criteria) this;
        }

        public Criteria andNodeipIsNotNull() {
            addCriterion("nodeIp is not null");
            return (Criteria) this;
        }

        public Criteria andNodeipEqualTo(String value) {
            addCriterion("nodeIp =", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipNotEqualTo(String value) {
            addCriterion("nodeIp <>", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipGreaterThan(String value) {
            addCriterion("nodeIp >", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipGreaterThanOrEqualTo(String value) {
            addCriterion("nodeIp >=", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipLessThan(String value) {
            addCriterion("nodeIp <", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipLessThanOrEqualTo(String value) {
            addCriterion("nodeIp <=", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipLike(String value) {
            addCriterion("nodeIp like", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipNotLike(String value) {
            addCriterion("nodeIp not like", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipIn(List<String> values) {
            addCriterion("nodeIp in", values, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipNotIn(List<String> values) {
            addCriterion("nodeIp not in", values, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipBetween(String value1, String value2) {
            addCriterion("nodeIp between", value1, value2, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipNotBetween(String value1, String value2) {
            addCriterion("nodeIp not between", value1, value2, "nodeip");
            return (Criteria) this;
        }

        public Criteria andDatatimeIsNull() {
            addCriterion("dataTime is null");
            return (Criteria) this;
        }

        public Criteria andDatatimeIsNotNull() {
            addCriterion("dataTime is not null");
            return (Criteria) this;
        }

        public Criteria andDatatimeEqualTo(Date value) {
            addCriterion("dataTime =", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotEqualTo(Date value) {
            addCriterion("dataTime <>", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeGreaterThan(Date value) {
            addCriterion("dataTime >", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dataTime >=", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeLessThan(Date value) {
            addCriterion("dataTime <", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeLessThanOrEqualTo(Date value) {
            addCriterion("dataTime <=", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeIn(List<Date> values) {
            addCriterion("dataTime in", values, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotIn(List<Date> values) {
            addCriterion("dataTime not in", values, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeBetween(Date value1, Date value2) {
            addCriterion("dataTime between", value1, value2, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotBetween(Date value1, Date value2) {
            addCriterion("dataTime not between", value1, value2, "datatime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNull() {
            addCriterion("weather is null");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNotNull() {
            addCriterion("weather is not null");
            return (Criteria) this;
        }

        public Criteria andWeatherEqualTo(String value) {
            addCriterion("weather =", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotEqualTo(String value) {
            addCriterion("weather <>", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThan(String value) {
            addCriterion("weather >", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThanOrEqualTo(String value) {
            addCriterion("weather >=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThan(String value) {
            addCriterion("weather <", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThanOrEqualTo(String value) {
            addCriterion("weather <=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLike(String value) {
            addCriterion("weather like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotLike(String value) {
            addCriterion("weather not like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherIn(List<String> values) {
            addCriterion("weather in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotIn(List<String> values) {
            addCriterion("weather not in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherBetween(String value1, String value2) {
            addCriterion("weather between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotBetween(String value1, String value2) {
            addCriterion("weather not between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andWinddirectionIsNull() {
            addCriterion("windDirection is null");
            return (Criteria) this;
        }

        public Criteria andWinddirectionIsNotNull() {
            addCriterion("windDirection is not null");
            return (Criteria) this;
        }

        public Criteria andWinddirectionEqualTo(Integer value) {
            addCriterion("windDirection =", value, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWinddirectionNotEqualTo(Integer value) {
            addCriterion("windDirection <>", value, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWinddirectionGreaterThan(Integer value) {
            addCriterion("windDirection >", value, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWinddirectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("windDirection >=", value, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWinddirectionLessThan(Integer value) {
            addCriterion("windDirection <", value, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWinddirectionLessThanOrEqualTo(Integer value) {
            addCriterion("windDirection <=", value, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWinddirectionIn(List<Integer> values) {
            addCriterion("windDirection in", values, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWinddirectionNotIn(List<Integer> values) {
            addCriterion("windDirection not in", values, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWinddirectionBetween(Integer value1, Integer value2) {
            addCriterion("windDirection between", value1, value2, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWinddirectionNotBetween(Integer value1, Integer value2) {
            addCriterion("windDirection not between", value1, value2, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWindspeedIsNull() {
            addCriterion("windSpeed is null");
            return (Criteria) this;
        }

        public Criteria andWindspeedIsNotNull() {
            addCriterion("windSpeed is not null");
            return (Criteria) this;
        }

        public Criteria andWindspeedEqualTo(String value) {
            addCriterion("windSpeed =", value, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedNotEqualTo(String value) {
            addCriterion("windSpeed <>", value, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedGreaterThan(String value) {
            addCriterion("windSpeed >", value, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedGreaterThanOrEqualTo(String value) {
            addCriterion("windSpeed >=", value, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedLessThan(String value) {
            addCriterion("windSpeed <", value, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedLessThanOrEqualTo(String value) {
            addCriterion("windSpeed <=", value, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedLike(String value) {
            addCriterion("windSpeed like", value, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedNotLike(String value) {
            addCriterion("windSpeed not like", value, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedIn(List<String> values) {
            addCriterion("windSpeed in", values, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedNotIn(List<String> values) {
            addCriterion("windSpeed not in", values, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedBetween(String value1, String value2) {
            addCriterion("windSpeed between", value1, value2, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedNotBetween(String value1, String value2) {
            addCriterion("windSpeed not between", value1, value2, "windspeed");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(String value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(String value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(String value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(String value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(String value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLike(String value) {
            addCriterion("temperature like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotLike(String value) {
            addCriterion("temperature not like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<String> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<String> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(String value1, String value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(String value1, String value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andWaterlevelIsNull() {
            addCriterion("waterLevel is null");
            return (Criteria) this;
        }

        public Criteria andWaterlevelIsNotNull() {
            addCriterion("waterLevel is not null");
            return (Criteria) this;
        }

        public Criteria andWaterlevelEqualTo(String value) {
            addCriterion("waterLevel =", value, "waterlevel");
            return (Criteria) this;
        }

        public Criteria andWaterlevelNotEqualTo(String value) {
            addCriterion("waterLevel <>", value, "waterlevel");
            return (Criteria) this;
        }

        public Criteria andWaterlevelGreaterThan(String value) {
            addCriterion("waterLevel >", value, "waterlevel");
            return (Criteria) this;
        }

        public Criteria andWaterlevelGreaterThanOrEqualTo(String value) {
            addCriterion("waterLevel >=", value, "waterlevel");
            return (Criteria) this;
        }

        public Criteria andWaterlevelLessThan(String value) {
            addCriterion("waterLevel <", value, "waterlevel");
            return (Criteria) this;
        }

        public Criteria andWaterlevelLessThanOrEqualTo(String value) {
            addCriterion("waterLevel <=", value, "waterlevel");
            return (Criteria) this;
        }

        public Criteria andWaterlevelLike(String value) {
            addCriterion("waterLevel like", value, "waterlevel");
            return (Criteria) this;
        }

        public Criteria andWaterlevelNotLike(String value) {
            addCriterion("waterLevel not like", value, "waterlevel");
            return (Criteria) this;
        }

        public Criteria andWaterlevelIn(List<String> values) {
            addCriterion("waterLevel in", values, "waterlevel");
            return (Criteria) this;
        }

        public Criteria andWaterlevelNotIn(List<String> values) {
            addCriterion("waterLevel not in", values, "waterlevel");
            return (Criteria) this;
        }

        public Criteria andWaterlevelBetween(String value1, String value2) {
            addCriterion("waterLevel between", value1, value2, "waterlevel");
            return (Criteria) this;
        }

        public Criteria andWaterlevelNotBetween(String value1, String value2) {
            addCriterion("waterLevel not between", value1, value2, "waterlevel");
            return (Criteria) this;
        }

        public Criteria andGravityIsNull() {
            addCriterion("gravity is null");
            return (Criteria) this;
        }

        public Criteria andGravityIsNotNull() {
            addCriterion("gravity is not null");
            return (Criteria) this;
        }

        public Criteria andGravityEqualTo(String value) {
            addCriterion("gravity =", value, "gravity");
            return (Criteria) this;
        }

        public Criteria andGravityNotEqualTo(String value) {
            addCriterion("gravity <>", value, "gravity");
            return (Criteria) this;
        }

        public Criteria andGravityGreaterThan(String value) {
            addCriterion("gravity >", value, "gravity");
            return (Criteria) this;
        }

        public Criteria andGravityGreaterThanOrEqualTo(String value) {
            addCriterion("gravity >=", value, "gravity");
            return (Criteria) this;
        }

        public Criteria andGravityLessThan(String value) {
            addCriterion("gravity <", value, "gravity");
            return (Criteria) this;
        }

        public Criteria andGravityLessThanOrEqualTo(String value) {
            addCriterion("gravity <=", value, "gravity");
            return (Criteria) this;
        }

        public Criteria andGravityLike(String value) {
            addCriterion("gravity like", value, "gravity");
            return (Criteria) this;
        }

        public Criteria andGravityNotLike(String value) {
            addCriterion("gravity not like", value, "gravity");
            return (Criteria) this;
        }

        public Criteria andGravityIn(List<String> values) {
            addCriterion("gravity in", values, "gravity");
            return (Criteria) this;
        }

        public Criteria andGravityNotIn(List<String> values) {
            addCriterion("gravity not in", values, "gravity");
            return (Criteria) this;
        }

        public Criteria andGravityBetween(String value1, String value2) {
            addCriterion("gravity between", value1, value2, "gravity");
            return (Criteria) this;
        }

        public Criteria andGravityNotBetween(String value1, String value2) {
            addCriterion("gravity not between", value1, value2, "gravity");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNull() {
            addCriterion("frequency is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNotNull() {
            addCriterion("frequency is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyEqualTo(String value) {
            addCriterion("frequency =", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotEqualTo(String value) {
            addCriterion("frequency <>", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThan(String value) {
            addCriterion("frequency >", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("frequency >=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThan(String value) {
            addCriterion("frequency <", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThanOrEqualTo(String value) {
            addCriterion("frequency <=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLike(String value) {
            addCriterion("frequency like", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotLike(String value) {
            addCriterion("frequency not like", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyIn(List<String> values) {
            addCriterion("frequency in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotIn(List<String> values) {
            addCriterion("frequency not in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyBetween(String value1, String value2) {
            addCriterion("frequency between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotBetween(String value1, String value2) {
            addCriterion("frequency not between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andSubsidencedegreeIsNull() {
            addCriterion("subsidenceDegree is null");
            return (Criteria) this;
        }

        public Criteria andSubsidencedegreeIsNotNull() {
            addCriterion("subsidenceDegree is not null");
            return (Criteria) this;
        }

        public Criteria andSubsidencedegreeEqualTo(String value) {
            addCriterion("subsidenceDegree =", value, "subsidencedegree");
            return (Criteria) this;
        }

        public Criteria andSubsidencedegreeNotEqualTo(String value) {
            addCriterion("subsidenceDegree <>", value, "subsidencedegree");
            return (Criteria) this;
        }

        public Criteria andSubsidencedegreeGreaterThan(String value) {
            addCriterion("subsidenceDegree >", value, "subsidencedegree");
            return (Criteria) this;
        }

        public Criteria andSubsidencedegreeGreaterThanOrEqualTo(String value) {
            addCriterion("subsidenceDegree >=", value, "subsidencedegree");
            return (Criteria) this;
        }

        public Criteria andSubsidencedegreeLessThan(String value) {
            addCriterion("subsidenceDegree <", value, "subsidencedegree");
            return (Criteria) this;
        }

        public Criteria andSubsidencedegreeLessThanOrEqualTo(String value) {
            addCriterion("subsidenceDegree <=", value, "subsidencedegree");
            return (Criteria) this;
        }

        public Criteria andSubsidencedegreeLike(String value) {
            addCriterion("subsidenceDegree like", value, "subsidencedegree");
            return (Criteria) this;
        }

        public Criteria andSubsidencedegreeNotLike(String value) {
            addCriterion("subsidenceDegree not like", value, "subsidencedegree");
            return (Criteria) this;
        }

        public Criteria andSubsidencedegreeIn(List<String> values) {
            addCriterion("subsidenceDegree in", values, "subsidencedegree");
            return (Criteria) this;
        }

        public Criteria andSubsidencedegreeNotIn(List<String> values) {
            addCriterion("subsidenceDegree not in", values, "subsidencedegree");
            return (Criteria) this;
        }

        public Criteria andSubsidencedegreeBetween(String value1, String value2) {
            addCriterion("subsidenceDegree between", value1, value2, "subsidencedegree");
            return (Criteria) this;
        }

        public Criteria andSubsidencedegreeNotBetween(String value1, String value2) {
            addCriterion("subsidenceDegree not between", value1, value2, "subsidencedegree");
            return (Criteria) this;
        }

        public Criteria andDisplacementdegreeIsNull() {
            addCriterion("displacementDegree is null");
            return (Criteria) this;
        }

        public Criteria andDisplacementdegreeIsNotNull() {
            addCriterion("displacementDegree is not null");
            return (Criteria) this;
        }

        public Criteria andDisplacementdegreeEqualTo(String value) {
            addCriterion("displacementDegree =", value, "displacementdegree");
            return (Criteria) this;
        }

        public Criteria andDisplacementdegreeNotEqualTo(String value) {
            addCriterion("displacementDegree <>", value, "displacementdegree");
            return (Criteria) this;
        }

        public Criteria andDisplacementdegreeGreaterThan(String value) {
            addCriterion("displacementDegree >", value, "displacementdegree");
            return (Criteria) this;
        }

        public Criteria andDisplacementdegreeGreaterThanOrEqualTo(String value) {
            addCriterion("displacementDegree >=", value, "displacementdegree");
            return (Criteria) this;
        }

        public Criteria andDisplacementdegreeLessThan(String value) {
            addCriterion("displacementDegree <", value, "displacementdegree");
            return (Criteria) this;
        }

        public Criteria andDisplacementdegreeLessThanOrEqualTo(String value) {
            addCriterion("displacementDegree <=", value, "displacementdegree");
            return (Criteria) this;
        }

        public Criteria andDisplacementdegreeLike(String value) {
            addCriterion("displacementDegree like", value, "displacementdegree");
            return (Criteria) this;
        }

        public Criteria andDisplacementdegreeNotLike(String value) {
            addCriterion("displacementDegree not like", value, "displacementdegree");
            return (Criteria) this;
        }

        public Criteria andDisplacementdegreeIn(List<String> values) {
            addCriterion("displacementDegree in", values, "displacementdegree");
            return (Criteria) this;
        }

        public Criteria andDisplacementdegreeNotIn(List<String> values) {
            addCriterion("displacementDegree not in", values, "displacementdegree");
            return (Criteria) this;
        }

        public Criteria andDisplacementdegreeBetween(String value1, String value2) {
            addCriterion("displacementDegree between", value1, value2, "displacementdegree");
            return (Criteria) this;
        }

        public Criteria andDisplacementdegreeNotBetween(String value1, String value2) {
            addCriterion("displacementDegree not between", value1, value2, "displacementdegree");
            return (Criteria) this;
        }

        public Criteria andTiltdegreeIsNull() {
            addCriterion("tiltDegree is null");
            return (Criteria) this;
        }

        public Criteria andTiltdegreeIsNotNull() {
            addCriterion("tiltDegree is not null");
            return (Criteria) this;
        }

        public Criteria andTiltdegreeEqualTo(String value) {
            addCriterion("tiltDegree =", value, "tiltdegree");
            return (Criteria) this;
        }

        public Criteria andTiltdegreeNotEqualTo(String value) {
            addCriterion("tiltDegree <>", value, "tiltdegree");
            return (Criteria) this;
        }

        public Criteria andTiltdegreeGreaterThan(String value) {
            addCriterion("tiltDegree >", value, "tiltdegree");
            return (Criteria) this;
        }

        public Criteria andTiltdegreeGreaterThanOrEqualTo(String value) {
            addCriterion("tiltDegree >=", value, "tiltdegree");
            return (Criteria) this;
        }

        public Criteria andTiltdegreeLessThan(String value) {
            addCriterion("tiltDegree <", value, "tiltdegree");
            return (Criteria) this;
        }

        public Criteria andTiltdegreeLessThanOrEqualTo(String value) {
            addCriterion("tiltDegree <=", value, "tiltdegree");
            return (Criteria) this;
        }

        public Criteria andTiltdegreeLike(String value) {
            addCriterion("tiltDegree like", value, "tiltdegree");
            return (Criteria) this;
        }

        public Criteria andTiltdegreeNotLike(String value) {
            addCriterion("tiltDegree not like", value, "tiltdegree");
            return (Criteria) this;
        }

        public Criteria andTiltdegreeIn(List<String> values) {
            addCriterion("tiltDegree in", values, "tiltdegree");
            return (Criteria) this;
        }

        public Criteria andTiltdegreeNotIn(List<String> values) {
            addCriterion("tiltDegree not in", values, "tiltdegree");
            return (Criteria) this;
        }

        public Criteria andTiltdegreeBetween(String value1, String value2) {
            addCriterion("tiltDegree between", value1, value2, "tiltdegree");
            return (Criteria) this;
        }

        public Criteria andTiltdegreeNotBetween(String value1, String value2) {
            addCriterion("tiltDegree not between", value1, value2, "tiltdegree");
            return (Criteria) this;
        }

        public Criteria andAffectresultIsNull() {
            addCriterion("affectResult is null");
            return (Criteria) this;
        }

        public Criteria andAffectresultIsNotNull() {
            addCriterion("affectResult is not null");
            return (Criteria) this;
        }

        public Criteria andAffectresultEqualTo(Integer value) {
            addCriterion("affectResult =", value, "affectresult");
            return (Criteria) this;
        }

        public Criteria andAffectresultNotEqualTo(Integer value) {
            addCriterion("affectResult <>", value, "affectresult");
            return (Criteria) this;
        }

        public Criteria andAffectresultGreaterThan(Integer value) {
            addCriterion("affectResult >", value, "affectresult");
            return (Criteria) this;
        }

        public Criteria andAffectresultGreaterThanOrEqualTo(Integer value) {
            addCriterion("affectResult >=", value, "affectresult");
            return (Criteria) this;
        }

        public Criteria andAffectresultLessThan(Integer value) {
            addCriterion("affectResult <", value, "affectresult");
            return (Criteria) this;
        }

        public Criteria andAffectresultLessThanOrEqualTo(Integer value) {
            addCriterion("affectResult <=", value, "affectresult");
            return (Criteria) this;
        }

        public Criteria andAffectresultIn(List<Integer> values) {
            addCriterion("affectResult in", values, "affectresult");
            return (Criteria) this;
        }

        public Criteria andAffectresultNotIn(List<Integer> values) {
            addCriterion("affectResult not in", values, "affectresult");
            return (Criteria) this;
        }

        public Criteria andAffectresultBetween(Integer value1, Integer value2) {
            addCriterion("affectResult between", value1, value2, "affectresult");
            return (Criteria) this;
        }

        public Criteria andAffectresultNotBetween(Integer value1, Integer value2) {
            addCriterion("affectResult not between", value1, value2, "affectresult");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}