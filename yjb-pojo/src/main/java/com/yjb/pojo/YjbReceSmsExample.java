package com.yjb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YjbReceSmsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YjbReceSmsExample() {
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

        public Criteria andReceSmsIdIsNull() {
            addCriterion("rece_sms_id is null");
            return (Criteria) this;
        }

        public Criteria andReceSmsIdIsNotNull() {
            addCriterion("rece_sms_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceSmsIdEqualTo(String value) {
            addCriterion("rece_sms_id =", value, "receSmsId");
            return (Criteria) this;
        }

        public Criteria andReceSmsIdNotEqualTo(String value) {
            addCriterion("rece_sms_id <>", value, "receSmsId");
            return (Criteria) this;
        }

        public Criteria andReceSmsIdGreaterThan(String value) {
            addCriterion("rece_sms_id >", value, "receSmsId");
            return (Criteria) this;
        }

        public Criteria andReceSmsIdGreaterThanOrEqualTo(String value) {
            addCriterion("rece_sms_id >=", value, "receSmsId");
            return (Criteria) this;
        }

        public Criteria andReceSmsIdLessThan(String value) {
            addCriterion("rece_sms_id <", value, "receSmsId");
            return (Criteria) this;
        }

        public Criteria andReceSmsIdLessThanOrEqualTo(String value) {
            addCriterion("rece_sms_id <=", value, "receSmsId");
            return (Criteria) this;
        }

        public Criteria andReceSmsIdLike(String value) {
            addCriterion("rece_sms_id like", value, "receSmsId");
            return (Criteria) this;
        }

        public Criteria andReceSmsIdNotLike(String value) {
            addCriterion("rece_sms_id not like", value, "receSmsId");
            return (Criteria) this;
        }

        public Criteria andReceSmsIdIn(List<String> values) {
            addCriterion("rece_sms_id in", values, "receSmsId");
            return (Criteria) this;
        }

        public Criteria andReceSmsIdNotIn(List<String> values) {
            addCriterion("rece_sms_id not in", values, "receSmsId");
            return (Criteria) this;
        }

        public Criteria andReceSmsIdBetween(String value1, String value2) {
            addCriterion("rece_sms_id between", value1, value2, "receSmsId");
            return (Criteria) this;
        }

        public Criteria andReceSmsIdNotBetween(String value1, String value2) {
            addCriterion("rece_sms_id not between", value1, value2, "receSmsId");
            return (Criteria) this;
        }

        public Criteria andReceFromIsNull() {
            addCriterion("rece_from is null");
            return (Criteria) this;
        }

        public Criteria andReceFromIsNotNull() {
            addCriterion("rece_from is not null");
            return (Criteria) this;
        }

        public Criteria andReceFromEqualTo(Long value) {
            addCriterion("rece_from =", value, "receFrom");
            return (Criteria) this;
        }

        public Criteria andReceFromNotEqualTo(Long value) {
            addCriterion("rece_from <>", value, "receFrom");
            return (Criteria) this;
        }

        public Criteria andReceFromGreaterThan(Long value) {
            addCriterion("rece_from >", value, "receFrom");
            return (Criteria) this;
        }

        public Criteria andReceFromGreaterThanOrEqualTo(Long value) {
            addCriterion("rece_from >=", value, "receFrom");
            return (Criteria) this;
        }

        public Criteria andReceFromLessThan(Long value) {
            addCriterion("rece_from <", value, "receFrom");
            return (Criteria) this;
        }

        public Criteria andReceFromLessThanOrEqualTo(Long value) {
            addCriterion("rece_from <=", value, "receFrom");
            return (Criteria) this;
        }

        public Criteria andReceFromIn(List<Long> values) {
            addCriterion("rece_from in", values, "receFrom");
            return (Criteria) this;
        }

        public Criteria andReceFromNotIn(List<Long> values) {
            addCriterion("rece_from not in", values, "receFrom");
            return (Criteria) this;
        }

        public Criteria andReceFromBetween(Long value1, Long value2) {
            addCriterion("rece_from between", value1, value2, "receFrom");
            return (Criteria) this;
        }

        public Criteria andReceFromNotBetween(Long value1, Long value2) {
            addCriterion("rece_from not between", value1, value2, "receFrom");
            return (Criteria) this;
        }

        public Criteria andReceTimeIsNull() {
            addCriterion("rece_time is null");
            return (Criteria) this;
        }

        public Criteria andReceTimeIsNotNull() {
            addCriterion("rece_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceTimeEqualTo(Date value) {
            addCriterion("rece_time =", value, "receTime");
            return (Criteria) this;
        }

        public Criteria andReceTimeNotEqualTo(Date value) {
            addCriterion("rece_time <>", value, "receTime");
            return (Criteria) this;
        }

        public Criteria andReceTimeGreaterThan(Date value) {
            addCriterion("rece_time >", value, "receTime");
            return (Criteria) this;
        }

        public Criteria andReceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rece_time >=", value, "receTime");
            return (Criteria) this;
        }

        public Criteria andReceTimeLessThan(Date value) {
            addCriterion("rece_time <", value, "receTime");
            return (Criteria) this;
        }

        public Criteria andReceTimeLessThanOrEqualTo(Date value) {
            addCriterion("rece_time <=", value, "receTime");
            return (Criteria) this;
        }

        public Criteria andReceTimeIn(List<Date> values) {
            addCriterion("rece_time in", values, "receTime");
            return (Criteria) this;
        }

        public Criteria andReceTimeNotIn(List<Date> values) {
            addCriterion("rece_time not in", values, "receTime");
            return (Criteria) this;
        }

        public Criteria andReceTimeBetween(Date value1, Date value2) {
            addCriterion("rece_time between", value1, value2, "receTime");
            return (Criteria) this;
        }

        public Criteria andReceTimeNotBetween(Date value1, Date value2) {
            addCriterion("rece_time not between", value1, value2, "receTime");
            return (Criteria) this;
        }

        public Criteria andReceStatusIsNull() {
            addCriterion("rece_status is null");
            return (Criteria) this;
        }

        public Criteria andReceStatusIsNotNull() {
            addCriterion("rece_status is not null");
            return (Criteria) this;
        }

        public Criteria andReceStatusEqualTo(Byte value) {
            addCriterion("rece_status =", value, "receStatus");
            return (Criteria) this;
        }

        public Criteria andReceStatusNotEqualTo(Byte value) {
            addCriterion("rece_status <>", value, "receStatus");
            return (Criteria) this;
        }

        public Criteria andReceStatusGreaterThan(Byte value) {
            addCriterion("rece_status >", value, "receStatus");
            return (Criteria) this;
        }

        public Criteria andReceStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("rece_status >=", value, "receStatus");
            return (Criteria) this;
        }

        public Criteria andReceStatusLessThan(Byte value) {
            addCriterion("rece_status <", value, "receStatus");
            return (Criteria) this;
        }

        public Criteria andReceStatusLessThanOrEqualTo(Byte value) {
            addCriterion("rece_status <=", value, "receStatus");
            return (Criteria) this;
        }

        public Criteria andReceStatusIn(List<Byte> values) {
            addCriterion("rece_status in", values, "receStatus");
            return (Criteria) this;
        }

        public Criteria andReceStatusNotIn(List<Byte> values) {
            addCriterion("rece_status not in", values, "receStatus");
            return (Criteria) this;
        }

        public Criteria andReceStatusBetween(Byte value1, Byte value2) {
            addCriterion("rece_status between", value1, value2, "receStatus");
            return (Criteria) this;
        }

        public Criteria andReceStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("rece_status not between", value1, value2, "receStatus");
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