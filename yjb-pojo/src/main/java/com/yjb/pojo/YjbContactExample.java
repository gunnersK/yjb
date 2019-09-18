package com.yjb.pojo;

import java.util.ArrayList;
import java.util.List;

public class YjbContactExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YjbContactExample() {
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

        public Criteria andCtcIdIsNull() {
            addCriterion("ctc_id is null");
            return (Criteria) this;
        }

        public Criteria andCtcIdIsNotNull() {
            addCriterion("ctc_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtcIdEqualTo(Long value) {
            addCriterion("ctc_id =", value, "ctcId");
            return (Criteria) this;
        }

        public Criteria andCtcIdNotEqualTo(Long value) {
            addCriterion("ctc_id <>", value, "ctcId");
            return (Criteria) this;
        }

        public Criteria andCtcIdGreaterThan(Long value) {
            addCriterion("ctc_id >", value, "ctcId");
            return (Criteria) this;
        }

        public Criteria andCtcIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ctc_id >=", value, "ctcId");
            return (Criteria) this;
        }

        public Criteria andCtcIdLessThan(Long value) {
            addCriterion("ctc_id <", value, "ctcId");
            return (Criteria) this;
        }

        public Criteria andCtcIdLessThanOrEqualTo(Long value) {
            addCriterion("ctc_id <=", value, "ctcId");
            return (Criteria) this;
        }

        public Criteria andCtcIdIn(List<Long> values) {
            addCriterion("ctc_id in", values, "ctcId");
            return (Criteria) this;
        }

        public Criteria andCtcIdNotIn(List<Long> values) {
            addCriterion("ctc_id not in", values, "ctcId");
            return (Criteria) this;
        }

        public Criteria andCtcIdBetween(Long value1, Long value2) {
            addCriterion("ctc_id between", value1, value2, "ctcId");
            return (Criteria) this;
        }

        public Criteria andCtcIdNotBetween(Long value1, Long value2) {
            addCriterion("ctc_id not between", value1, value2, "ctcId");
            return (Criteria) this;
        }

        public Criteria andCtcNameIsNull() {
            addCriterion("ctc_name is null");
            return (Criteria) this;
        }

        public Criteria andCtcNameIsNotNull() {
            addCriterion("ctc_name is not null");
            return (Criteria) this;
        }

        public Criteria andCtcNameEqualTo(String value) {
            addCriterion("ctc_name =", value, "ctcName");
            return (Criteria) this;
        }

        public Criteria andCtcNameNotEqualTo(String value) {
            addCriterion("ctc_name <>", value, "ctcName");
            return (Criteria) this;
        }

        public Criteria andCtcNameGreaterThan(String value) {
            addCriterion("ctc_name >", value, "ctcName");
            return (Criteria) this;
        }

        public Criteria andCtcNameGreaterThanOrEqualTo(String value) {
            addCriterion("ctc_name >=", value, "ctcName");
            return (Criteria) this;
        }

        public Criteria andCtcNameLessThan(String value) {
            addCriterion("ctc_name <", value, "ctcName");
            return (Criteria) this;
        }

        public Criteria andCtcNameLessThanOrEqualTo(String value) {
            addCriterion("ctc_name <=", value, "ctcName");
            return (Criteria) this;
        }

        public Criteria andCtcNameLike(String value) {
            addCriterion("ctc_name like", value, "ctcName");
            return (Criteria) this;
        }

        public Criteria andCtcNameNotLike(String value) {
            addCriterion("ctc_name not like", value, "ctcName");
            return (Criteria) this;
        }

        public Criteria andCtcNameIn(List<String> values) {
            addCriterion("ctc_name in", values, "ctcName");
            return (Criteria) this;
        }

        public Criteria andCtcNameNotIn(List<String> values) {
            addCriterion("ctc_name not in", values, "ctcName");
            return (Criteria) this;
        }

        public Criteria andCtcNameBetween(String value1, String value2) {
            addCriterion("ctc_name between", value1, value2, "ctcName");
            return (Criteria) this;
        }

        public Criteria andCtcNameNotBetween(String value1, String value2) {
            addCriterion("ctc_name not between", value1, value2, "ctcName");
            return (Criteria) this;
        }

        public Criteria andCtcGenderIsNull() {
            addCriterion("ctc_gender is null");
            return (Criteria) this;
        }

        public Criteria andCtcGenderIsNotNull() {
            addCriterion("ctc_gender is not null");
            return (Criteria) this;
        }

        public Criteria andCtcGenderEqualTo(String value) {
            addCriterion("ctc_gender =", value, "ctcGender");
            return (Criteria) this;
        }

        public Criteria andCtcGenderNotEqualTo(String value) {
            addCriterion("ctc_gender <>", value, "ctcGender");
            return (Criteria) this;
        }

        public Criteria andCtcGenderGreaterThan(String value) {
            addCriterion("ctc_gender >", value, "ctcGender");
            return (Criteria) this;
        }

        public Criteria andCtcGenderGreaterThanOrEqualTo(String value) {
            addCriterion("ctc_gender >=", value, "ctcGender");
            return (Criteria) this;
        }

        public Criteria andCtcGenderLessThan(String value) {
            addCriterion("ctc_gender <", value, "ctcGender");
            return (Criteria) this;
        }

        public Criteria andCtcGenderLessThanOrEqualTo(String value) {
            addCriterion("ctc_gender <=", value, "ctcGender");
            return (Criteria) this;
        }

        public Criteria andCtcGenderLike(String value) {
            addCriterion("ctc_gender like", value, "ctcGender");
            return (Criteria) this;
        }

        public Criteria andCtcGenderNotLike(String value) {
            addCriterion("ctc_gender not like", value, "ctcGender");
            return (Criteria) this;
        }

        public Criteria andCtcGenderIn(List<String> values) {
            addCriterion("ctc_gender in", values, "ctcGender");
            return (Criteria) this;
        }

        public Criteria andCtcGenderNotIn(List<String> values) {
            addCriterion("ctc_gender not in", values, "ctcGender");
            return (Criteria) this;
        }

        public Criteria andCtcGenderBetween(String value1, String value2) {
            addCriterion("ctc_gender between", value1, value2, "ctcGender");
            return (Criteria) this;
        }

        public Criteria andCtcGenderNotBetween(String value1, String value2) {
            addCriterion("ctc_gender not between", value1, value2, "ctcGender");
            return (Criteria) this;
        }

        public Criteria andCtcEmailIsNull() {
            addCriterion("ctc_email is null");
            return (Criteria) this;
        }

        public Criteria andCtcEmailIsNotNull() {
            addCriterion("ctc_email is not null");
            return (Criteria) this;
        }

        public Criteria andCtcEmailEqualTo(String value) {
            addCriterion("ctc_email =", value, "ctcEmail");
            return (Criteria) this;
        }

        public Criteria andCtcEmailNotEqualTo(String value) {
            addCriterion("ctc_email <>", value, "ctcEmail");
            return (Criteria) this;
        }

        public Criteria andCtcEmailGreaterThan(String value) {
            addCriterion("ctc_email >", value, "ctcEmail");
            return (Criteria) this;
        }

        public Criteria andCtcEmailGreaterThanOrEqualTo(String value) {
            addCriterion("ctc_email >=", value, "ctcEmail");
            return (Criteria) this;
        }

        public Criteria andCtcEmailLessThan(String value) {
            addCriterion("ctc_email <", value, "ctcEmail");
            return (Criteria) this;
        }

        public Criteria andCtcEmailLessThanOrEqualTo(String value) {
            addCriterion("ctc_email <=", value, "ctcEmail");
            return (Criteria) this;
        }

        public Criteria andCtcEmailLike(String value) {
            addCriterion("ctc_email like", value, "ctcEmail");
            return (Criteria) this;
        }

        public Criteria andCtcEmailNotLike(String value) {
            addCriterion("ctc_email not like", value, "ctcEmail");
            return (Criteria) this;
        }

        public Criteria andCtcEmailIn(List<String> values) {
            addCriterion("ctc_email in", values, "ctcEmail");
            return (Criteria) this;
        }

        public Criteria andCtcEmailNotIn(List<String> values) {
            addCriterion("ctc_email not in", values, "ctcEmail");
            return (Criteria) this;
        }

        public Criteria andCtcEmailBetween(String value1, String value2) {
            addCriterion("ctc_email between", value1, value2, "ctcEmail");
            return (Criteria) this;
        }

        public Criteria andCtcEmailNotBetween(String value1, String value2) {
            addCriterion("ctc_email not between", value1, value2, "ctcEmail");
            return (Criteria) this;
        }

        public Criteria andCtcPhoneIsNull() {
            addCriterion("ctc_phone is null");
            return (Criteria) this;
        }

        public Criteria andCtcPhoneIsNotNull() {
            addCriterion("ctc_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCtcPhoneEqualTo(String value) {
            addCriterion("ctc_phone =", value, "ctcPhone");
            return (Criteria) this;
        }

        public Criteria andCtcPhoneNotEqualTo(String value) {
            addCriterion("ctc_phone <>", value, "ctcPhone");
            return (Criteria) this;
        }

        public Criteria andCtcPhoneGreaterThan(String value) {
            addCriterion("ctc_phone >", value, "ctcPhone");
            return (Criteria) this;
        }

        public Criteria andCtcPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ctc_phone >=", value, "ctcPhone");
            return (Criteria) this;
        }

        public Criteria andCtcPhoneLessThan(String value) {
            addCriterion("ctc_phone <", value, "ctcPhone");
            return (Criteria) this;
        }

        public Criteria andCtcPhoneLessThanOrEqualTo(String value) {
            addCriterion("ctc_phone <=", value, "ctcPhone");
            return (Criteria) this;
        }

        public Criteria andCtcPhoneLike(String value) {
            addCriterion("ctc_phone like", value, "ctcPhone");
            return (Criteria) this;
        }

        public Criteria andCtcPhoneNotLike(String value) {
            addCriterion("ctc_phone not like", value, "ctcPhone");
            return (Criteria) this;
        }

        public Criteria andCtcPhoneIn(List<String> values) {
            addCriterion("ctc_phone in", values, "ctcPhone");
            return (Criteria) this;
        }

        public Criteria andCtcPhoneNotIn(List<String> values) {
            addCriterion("ctc_phone not in", values, "ctcPhone");
            return (Criteria) this;
        }

        public Criteria andCtcPhoneBetween(String value1, String value2) {
            addCriterion("ctc_phone between", value1, value2, "ctcPhone");
            return (Criteria) this;
        }

        public Criteria andCtcPhoneNotBetween(String value1, String value2) {
            addCriterion("ctc_phone not between", value1, value2, "ctcPhone");
            return (Criteria) this;
        }

        public Criteria andCtcTelIsNull() {
            addCriterion("ctc_tel is null");
            return (Criteria) this;
        }

        public Criteria andCtcTelIsNotNull() {
            addCriterion("ctc_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCtcTelEqualTo(String value) {
            addCriterion("ctc_tel =", value, "ctcTel");
            return (Criteria) this;
        }

        public Criteria andCtcTelNotEqualTo(String value) {
            addCriterion("ctc_tel <>", value, "ctcTel");
            return (Criteria) this;
        }

        public Criteria andCtcTelGreaterThan(String value) {
            addCriterion("ctc_tel >", value, "ctcTel");
            return (Criteria) this;
        }

        public Criteria andCtcTelGreaterThanOrEqualTo(String value) {
            addCriterion("ctc_tel >=", value, "ctcTel");
            return (Criteria) this;
        }

        public Criteria andCtcTelLessThan(String value) {
            addCriterion("ctc_tel <", value, "ctcTel");
            return (Criteria) this;
        }

        public Criteria andCtcTelLessThanOrEqualTo(String value) {
            addCriterion("ctc_tel <=", value, "ctcTel");
            return (Criteria) this;
        }

        public Criteria andCtcTelLike(String value) {
            addCriterion("ctc_tel like", value, "ctcTel");
            return (Criteria) this;
        }

        public Criteria andCtcTelNotLike(String value) {
            addCriterion("ctc_tel not like", value, "ctcTel");
            return (Criteria) this;
        }

        public Criteria andCtcTelIn(List<String> values) {
            addCriterion("ctc_tel in", values, "ctcTel");
            return (Criteria) this;
        }

        public Criteria andCtcTelNotIn(List<String> values) {
            addCriterion("ctc_tel not in", values, "ctcTel");
            return (Criteria) this;
        }

        public Criteria andCtcTelBetween(String value1, String value2) {
            addCriterion("ctc_tel between", value1, value2, "ctcTel");
            return (Criteria) this;
        }

        public Criteria andCtcTelNotBetween(String value1, String value2) {
            addCriterion("ctc_tel not between", value1, value2, "ctcTel");
            return (Criteria) this;
        }

        public Criteria andCtcGroupIsNull() {
            addCriterion("ctc_group is null");
            return (Criteria) this;
        }

        public Criteria andCtcGroupIsNotNull() {
            addCriterion("ctc_group is not null");
            return (Criteria) this;
        }

        public Criteria andCtcGroupEqualTo(Integer value) {
            addCriterion("ctc_group =", value, "ctcGroup");
            return (Criteria) this;
        }

        public Criteria andCtcGroupNotEqualTo(Integer value) {
            addCriterion("ctc_group <>", value, "ctcGroup");
            return (Criteria) this;
        }

        public Criteria andCtcGroupGreaterThan(Integer value) {
            addCriterion("ctc_group >", value, "ctcGroup");
            return (Criteria) this;
        }

        public Criteria andCtcGroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctc_group >=", value, "ctcGroup");
            return (Criteria) this;
        }

        public Criteria andCtcGroupLessThan(Integer value) {
            addCriterion("ctc_group <", value, "ctcGroup");
            return (Criteria) this;
        }

        public Criteria andCtcGroupLessThanOrEqualTo(Integer value) {
            addCriterion("ctc_group <=", value, "ctcGroup");
            return (Criteria) this;
        }

        public Criteria andCtcGroupIn(List<Integer> values) {
            addCriterion("ctc_group in", values, "ctcGroup");
            return (Criteria) this;
        }

        public Criteria andCtcGroupNotIn(List<Integer> values) {
            addCriterion("ctc_group not in", values, "ctcGroup");
            return (Criteria) this;
        }

        public Criteria andCtcGroupBetween(Integer value1, Integer value2) {
            addCriterion("ctc_group between", value1, value2, "ctcGroup");
            return (Criteria) this;
        }

        public Criteria andCtcGroupNotBetween(Integer value1, Integer value2) {
            addCriterion("ctc_group not between", value1, value2, "ctcGroup");
            return (Criteria) this;
        }

        public Criteria andCtcJobIsNull() {
            addCriterion("ctc_job is null");
            return (Criteria) this;
        }

        public Criteria andCtcJobIsNotNull() {
            addCriterion("ctc_job is not null");
            return (Criteria) this;
        }

        public Criteria andCtcJobEqualTo(String value) {
            addCriterion("ctc_job =", value, "ctcJob");
            return (Criteria) this;
        }

        public Criteria andCtcJobNotEqualTo(String value) {
            addCriterion("ctc_job <>", value, "ctcJob");
            return (Criteria) this;
        }

        public Criteria andCtcJobGreaterThan(String value) {
            addCriterion("ctc_job >", value, "ctcJob");
            return (Criteria) this;
        }

        public Criteria andCtcJobGreaterThanOrEqualTo(String value) {
            addCriterion("ctc_job >=", value, "ctcJob");
            return (Criteria) this;
        }

        public Criteria andCtcJobLessThan(String value) {
            addCriterion("ctc_job <", value, "ctcJob");
            return (Criteria) this;
        }

        public Criteria andCtcJobLessThanOrEqualTo(String value) {
            addCriterion("ctc_job <=", value, "ctcJob");
            return (Criteria) this;
        }

        public Criteria andCtcJobLike(String value) {
            addCriterion("ctc_job like", value, "ctcJob");
            return (Criteria) this;
        }

        public Criteria andCtcJobNotLike(String value) {
            addCriterion("ctc_job not like", value, "ctcJob");
            return (Criteria) this;
        }

        public Criteria andCtcJobIn(List<String> values) {
            addCriterion("ctc_job in", values, "ctcJob");
            return (Criteria) this;
        }

        public Criteria andCtcJobNotIn(List<String> values) {
            addCriterion("ctc_job not in", values, "ctcJob");
            return (Criteria) this;
        }

        public Criteria andCtcJobBetween(String value1, String value2) {
            addCriterion("ctc_job between", value1, value2, "ctcJob");
            return (Criteria) this;
        }

        public Criteria andCtcJobNotBetween(String value1, String value2) {
            addCriterion("ctc_job not between", value1, value2, "ctcJob");
            return (Criteria) this;
        }

        public Criteria andComAddrIsNull() {
            addCriterion("com_addr is null");
            return (Criteria) this;
        }

        public Criteria andComAddrIsNotNull() {
            addCriterion("com_addr is not null");
            return (Criteria) this;
        }

        public Criteria andComAddrEqualTo(String value) {
            addCriterion("com_addr =", value, "comAddr");
            return (Criteria) this;
        }

        public Criteria andComAddrNotEqualTo(String value) {
            addCriterion("com_addr <>", value, "comAddr");
            return (Criteria) this;
        }

        public Criteria andComAddrGreaterThan(String value) {
            addCriterion("com_addr >", value, "comAddr");
            return (Criteria) this;
        }

        public Criteria andComAddrGreaterThanOrEqualTo(String value) {
            addCriterion("com_addr >=", value, "comAddr");
            return (Criteria) this;
        }

        public Criteria andComAddrLessThan(String value) {
            addCriterion("com_addr <", value, "comAddr");
            return (Criteria) this;
        }

        public Criteria andComAddrLessThanOrEqualTo(String value) {
            addCriterion("com_addr <=", value, "comAddr");
            return (Criteria) this;
        }

        public Criteria andComAddrLike(String value) {
            addCriterion("com_addr like", value, "comAddr");
            return (Criteria) this;
        }

        public Criteria andComAddrNotLike(String value) {
            addCriterion("com_addr not like", value, "comAddr");
            return (Criteria) this;
        }

        public Criteria andComAddrIn(List<String> values) {
            addCriterion("com_addr in", values, "comAddr");
            return (Criteria) this;
        }

        public Criteria andComAddrNotIn(List<String> values) {
            addCriterion("com_addr not in", values, "comAddr");
            return (Criteria) this;
        }

        public Criteria andComAddrBetween(String value1, String value2) {
            addCriterion("com_addr between", value1, value2, "comAddr");
            return (Criteria) this;
        }

        public Criteria andComAddrNotBetween(String value1, String value2) {
            addCriterion("com_addr not between", value1, value2, "comAddr");
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