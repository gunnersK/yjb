package com.yjb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YjbSmsRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YjbSmsRecordExample() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Long value) {
            addCriterion("record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Long value) {
            addCriterion("record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(Long value) {
            addCriterion("record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Long value) {
            addCriterion("record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Long> values) {
            addCriterion("record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Long> values) {
            addCriterion("record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Long value1, Long value2) {
            addCriterion("record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("record_id not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andSmsIdIsNull() {
            addCriterion("sms_id is null");
            return (Criteria) this;
        }

        public Criteria andSmsIdIsNotNull() {
            addCriterion("sms_id is not null");
            return (Criteria) this;
        }

        public Criteria andSmsIdEqualTo(String value) {
            addCriterion("sms_id =", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdNotEqualTo(String value) {
            addCriterion("sms_id <>", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdGreaterThan(String value) {
            addCriterion("sms_id >", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdGreaterThanOrEqualTo(String value) {
            addCriterion("sms_id >=", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdLessThan(String value) {
            addCriterion("sms_id <", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdLessThanOrEqualTo(String value) {
            addCriterion("sms_id <=", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdLike(String value) {
            addCriterion("sms_id like", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdNotLike(String value) {
            addCriterion("sms_id not like", value, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdIn(List<String> values) {
            addCriterion("sms_id in", values, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdNotIn(List<String> values) {
            addCriterion("sms_id not in", values, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdBetween(String value1, String value2) {
            addCriterion("sms_id between", value1, value2, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsIdNotBetween(String value1, String value2) {
            addCriterion("sms_id not between", value1, value2, "smsId");
            return (Criteria) this;
        }

        public Criteria andSmsCtcIsNull() {
            addCriterion("sms_ctc is null");
            return (Criteria) this;
        }

        public Criteria andSmsCtcIsNotNull() {
            addCriterion("sms_ctc is not null");
            return (Criteria) this;
        }

        public Criteria andSmsCtcEqualTo(Long value) {
            addCriterion("sms_ctc =", value, "smsCtc");
            return (Criteria) this;
        }

        public Criteria andSmsCtcNotEqualTo(Long value) {
            addCriterion("sms_ctc <>", value, "smsCtc");
            return (Criteria) this;
        }

        public Criteria andSmsCtcGreaterThan(Long value) {
            addCriterion("sms_ctc >", value, "smsCtc");
            return (Criteria) this;
        }

        public Criteria andSmsCtcGreaterThanOrEqualTo(Long value) {
            addCriterion("sms_ctc >=", value, "smsCtc");
            return (Criteria) this;
        }

        public Criteria andSmsCtcLessThan(Long value) {
            addCriterion("sms_ctc <", value, "smsCtc");
            return (Criteria) this;
        }

        public Criteria andSmsCtcLessThanOrEqualTo(Long value) {
            addCriterion("sms_ctc <=", value, "smsCtc");
            return (Criteria) this;
        }

        public Criteria andSmsCtcIn(List<Long> values) {
            addCriterion("sms_ctc in", values, "smsCtc");
            return (Criteria) this;
        }

        public Criteria andSmsCtcNotIn(List<Long> values) {
            addCriterion("sms_ctc not in", values, "smsCtc");
            return (Criteria) this;
        }

        public Criteria andSmsCtcBetween(Long value1, Long value2) {
            addCriterion("sms_ctc between", value1, value2, "smsCtc");
            return (Criteria) this;
        }

        public Criteria andSmsCtcNotBetween(Long value1, Long value2) {
            addCriterion("sms_ctc not between", value1, value2, "smsCtc");
            return (Criteria) this;
        }

        public Criteria andSmsTimeIsNull() {
            addCriterion("sms_time is null");
            return (Criteria) this;
        }

        public Criteria andSmsTimeIsNotNull() {
            addCriterion("sms_time is not null");
            return (Criteria) this;
        }

        public Criteria andSmsTimeEqualTo(Date value) {
            addCriterion("sms_time =", value, "smsTime");
            return (Criteria) this;
        }

        public Criteria andSmsTimeNotEqualTo(Date value) {
            addCriterion("sms_time <>", value, "smsTime");
            return (Criteria) this;
        }

        public Criteria andSmsTimeGreaterThan(Date value) {
            addCriterion("sms_time >", value, "smsTime");
            return (Criteria) this;
        }

        public Criteria andSmsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sms_time >=", value, "smsTime");
            return (Criteria) this;
        }

        public Criteria andSmsTimeLessThan(Date value) {
            addCriterion("sms_time <", value, "smsTime");
            return (Criteria) this;
        }

        public Criteria andSmsTimeLessThanOrEqualTo(Date value) {
            addCriterion("sms_time <=", value, "smsTime");
            return (Criteria) this;
        }

        public Criteria andSmsTimeIn(List<Date> values) {
            addCriterion("sms_time in", values, "smsTime");
            return (Criteria) this;
        }

        public Criteria andSmsTimeNotIn(List<Date> values) {
            addCriterion("sms_time not in", values, "smsTime");
            return (Criteria) this;
        }

        public Criteria andSmsTimeBetween(Date value1, Date value2) {
            addCriterion("sms_time between", value1, value2, "smsTime");
            return (Criteria) this;
        }

        public Criteria andSmsTimeNotBetween(Date value1, Date value2) {
            addCriterion("sms_time not between", value1, value2, "smsTime");
            return (Criteria) this;
        }

        public Criteria andSmsStatusIsNull() {
            addCriterion("sms_status is null");
            return (Criteria) this;
        }

        public Criteria andSmsStatusIsNotNull() {
            addCriterion("sms_status is not null");
            return (Criteria) this;
        }

        public Criteria andSmsStatusEqualTo(Byte value) {
            addCriterion("sms_status =", value, "smsStatus");
            return (Criteria) this;
        }

        public Criteria andSmsStatusNotEqualTo(Byte value) {
            addCriterion("sms_status <>", value, "smsStatus");
            return (Criteria) this;
        }

        public Criteria andSmsStatusGreaterThan(Byte value) {
            addCriterion("sms_status >", value, "smsStatus");
            return (Criteria) this;
        }

        public Criteria andSmsStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sms_status >=", value, "smsStatus");
            return (Criteria) this;
        }

        public Criteria andSmsStatusLessThan(Byte value) {
            addCriterion("sms_status <", value, "smsStatus");
            return (Criteria) this;
        }

        public Criteria andSmsStatusLessThanOrEqualTo(Byte value) {
            addCriterion("sms_status <=", value, "smsStatus");
            return (Criteria) this;
        }

        public Criteria andSmsStatusIn(List<Byte> values) {
            addCriterion("sms_status in", values, "smsStatus");
            return (Criteria) this;
        }

        public Criteria andSmsStatusNotIn(List<Byte> values) {
            addCriterion("sms_status not in", values, "smsStatus");
            return (Criteria) this;
        }

        public Criteria andSmsStatusBetween(Byte value1, Byte value2) {
            addCriterion("sms_status between", value1, value2, "smsStatus");
            return (Criteria) this;
        }

        public Criteria andSmsStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("sms_status not between", value1, value2, "smsStatus");
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