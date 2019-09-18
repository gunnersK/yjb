package com.yjb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YjbSendSmsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YjbSendSmsExample() {
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

        public Criteria andSendSmsIdIsNull() {
            addCriterion("send_sms_id is null");
            return (Criteria) this;
        }

        public Criteria andSendSmsIdIsNotNull() {
            addCriterion("send_sms_id is not null");
            return (Criteria) this;
        }

        public Criteria andSendSmsIdEqualTo(String value) {
            addCriterion("send_sms_id =", value, "sendSmsId");
            return (Criteria) this;
        }

        public Criteria andSendSmsIdNotEqualTo(String value) {
            addCriterion("send_sms_id <>", value, "sendSmsId");
            return (Criteria) this;
        }

        public Criteria andSendSmsIdGreaterThan(String value) {
            addCriterion("send_sms_id >", value, "sendSmsId");
            return (Criteria) this;
        }

        public Criteria andSendSmsIdGreaterThanOrEqualTo(String value) {
            addCriterion("send_sms_id >=", value, "sendSmsId");
            return (Criteria) this;
        }

        public Criteria andSendSmsIdLessThan(String value) {
            addCriterion("send_sms_id <", value, "sendSmsId");
            return (Criteria) this;
        }

        public Criteria andSendSmsIdLessThanOrEqualTo(String value) {
            addCriterion("send_sms_id <=", value, "sendSmsId");
            return (Criteria) this;
        }

        public Criteria andSendSmsIdLike(String value) {
            addCriterion("send_sms_id like", value, "sendSmsId");
            return (Criteria) this;
        }

        public Criteria andSendSmsIdNotLike(String value) {
            addCriterion("send_sms_id not like", value, "sendSmsId");
            return (Criteria) this;
        }

        public Criteria andSendSmsIdIn(List<String> values) {
            addCriterion("send_sms_id in", values, "sendSmsId");
            return (Criteria) this;
        }

        public Criteria andSendSmsIdNotIn(List<String> values) {
            addCriterion("send_sms_id not in", values, "sendSmsId");
            return (Criteria) this;
        }

        public Criteria andSendSmsIdBetween(String value1, String value2) {
            addCriterion("send_sms_id between", value1, value2, "sendSmsId");
            return (Criteria) this;
        }

        public Criteria andSendSmsIdNotBetween(String value1, String value2) {
            addCriterion("send_sms_id not between", value1, value2, "sendSmsId");
            return (Criteria) this;
        }

        public Criteria andSendToIsNull() {
            addCriterion("send_to is null");
            return (Criteria) this;
        }

        public Criteria andSendToIsNotNull() {
            addCriterion("send_to is not null");
            return (Criteria) this;
        }

        public Criteria andSendToEqualTo(Long value) {
            addCriterion("send_to =", value, "sendTo");
            return (Criteria) this;
        }

        public Criteria andSendToNotEqualTo(Long value) {
            addCriterion("send_to <>", value, "sendTo");
            return (Criteria) this;
        }

        public Criteria andSendToGreaterThan(Long value) {
            addCriterion("send_to >", value, "sendTo");
            return (Criteria) this;
        }

        public Criteria andSendToGreaterThanOrEqualTo(Long value) {
            addCriterion("send_to >=", value, "sendTo");
            return (Criteria) this;
        }

        public Criteria andSendToLessThan(Long value) {
            addCriterion("send_to <", value, "sendTo");
            return (Criteria) this;
        }

        public Criteria andSendToLessThanOrEqualTo(Long value) {
            addCriterion("send_to <=", value, "sendTo");
            return (Criteria) this;
        }

        public Criteria andSendToIn(List<Long> values) {
            addCriterion("send_to in", values, "sendTo");
            return (Criteria) this;
        }

        public Criteria andSendToNotIn(List<Long> values) {
            addCriterion("send_to not in", values, "sendTo");
            return (Criteria) this;
        }

        public Criteria andSendToBetween(Long value1, Long value2) {
            addCriterion("send_to between", value1, value2, "sendTo");
            return (Criteria) this;
        }

        public Criteria andSendToNotBetween(Long value1, Long value2) {
            addCriterion("send_to not between", value1, value2, "sendTo");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNull() {
            addCriterion("send_status is null");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNotNull() {
            addCriterion("send_status is not null");
            return (Criteria) this;
        }

        public Criteria andSendStatusEqualTo(Byte value) {
            addCriterion("send_status =", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotEqualTo(Byte value) {
            addCriterion("send_status <>", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThan(Byte value) {
            addCriterion("send_status >", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("send_status >=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThan(Byte value) {
            addCriterion("send_status <", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThanOrEqualTo(Byte value) {
            addCriterion("send_status <=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusIn(List<Byte> values) {
            addCriterion("send_status in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotIn(List<Byte> values) {
            addCriterion("send_status not in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusBetween(Byte value1, Byte value2) {
            addCriterion("send_status between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("send_status not between", value1, value2, "sendStatus");
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