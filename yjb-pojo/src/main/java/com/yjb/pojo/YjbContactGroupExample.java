package com.yjb.pojo;

import java.util.ArrayList;
import java.util.List;

public class YjbContactGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YjbContactGroupExample() {
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

        public Criteria andGroIdIsNull() {
            addCriterion("gro_id is null");
            return (Criteria) this;
        }

        public Criteria andGroIdIsNotNull() {
            addCriterion("gro_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroIdEqualTo(Integer value) {
            addCriterion("gro_id =", value, "groId");
            return (Criteria) this;
        }

        public Criteria andGroIdNotEqualTo(Integer value) {
            addCriterion("gro_id <>", value, "groId");
            return (Criteria) this;
        }

        public Criteria andGroIdGreaterThan(Integer value) {
            addCriterion("gro_id >", value, "groId");
            return (Criteria) this;
        }

        public Criteria andGroIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gro_id >=", value, "groId");
            return (Criteria) this;
        }

        public Criteria andGroIdLessThan(Integer value) {
            addCriterion("gro_id <", value, "groId");
            return (Criteria) this;
        }

        public Criteria andGroIdLessThanOrEqualTo(Integer value) {
            addCriterion("gro_id <=", value, "groId");
            return (Criteria) this;
        }

        public Criteria andGroIdIn(List<Integer> values) {
            addCriterion("gro_id in", values, "groId");
            return (Criteria) this;
        }

        public Criteria andGroIdNotIn(List<Integer> values) {
            addCriterion("gro_id not in", values, "groId");
            return (Criteria) this;
        }

        public Criteria andGroIdBetween(Integer value1, Integer value2) {
            addCriterion("gro_id between", value1, value2, "groId");
            return (Criteria) this;
        }

        public Criteria andGroIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gro_id not between", value1, value2, "groId");
            return (Criteria) this;
        }

        public Criteria andGroAbbrIsNull() {
            addCriterion("gro_abbr is null");
            return (Criteria) this;
        }

        public Criteria andGroAbbrIsNotNull() {
            addCriterion("gro_abbr is not null");
            return (Criteria) this;
        }

        public Criteria andGroAbbrEqualTo(String value) {
            addCriterion("gro_abbr =", value, "groAbbr");
            return (Criteria) this;
        }

        public Criteria andGroAbbrNotEqualTo(String value) {
            addCriterion("gro_abbr <>", value, "groAbbr");
            return (Criteria) this;
        }

        public Criteria andGroAbbrGreaterThan(String value) {
            addCriterion("gro_abbr >", value, "groAbbr");
            return (Criteria) this;
        }

        public Criteria andGroAbbrGreaterThanOrEqualTo(String value) {
            addCriterion("gro_abbr >=", value, "groAbbr");
            return (Criteria) this;
        }

        public Criteria andGroAbbrLessThan(String value) {
            addCriterion("gro_abbr <", value, "groAbbr");
            return (Criteria) this;
        }

        public Criteria andGroAbbrLessThanOrEqualTo(String value) {
            addCriterion("gro_abbr <=", value, "groAbbr");
            return (Criteria) this;
        }

        public Criteria andGroAbbrLike(String value) {
            addCriterion("gro_abbr like", value, "groAbbr");
            return (Criteria) this;
        }

        public Criteria andGroAbbrNotLike(String value) {
            addCriterion("gro_abbr not like", value, "groAbbr");
            return (Criteria) this;
        }

        public Criteria andGroAbbrIn(List<String> values) {
            addCriterion("gro_abbr in", values, "groAbbr");
            return (Criteria) this;
        }

        public Criteria andGroAbbrNotIn(List<String> values) {
            addCriterion("gro_abbr not in", values, "groAbbr");
            return (Criteria) this;
        }

        public Criteria andGroAbbrBetween(String value1, String value2) {
            addCriterion("gro_abbr between", value1, value2, "groAbbr");
            return (Criteria) this;
        }

        public Criteria andGroAbbrNotBetween(String value1, String value2) {
            addCriterion("gro_abbr not between", value1, value2, "groAbbr");
            return (Criteria) this;
        }

        public Criteria andGroFullnameIsNull() {
            addCriterion("gro_fullname is null");
            return (Criteria) this;
        }

        public Criteria andGroFullnameIsNotNull() {
            addCriterion("gro_fullname is not null");
            return (Criteria) this;
        }

        public Criteria andGroFullnameEqualTo(String value) {
            addCriterion("gro_fullname =", value, "groFullname");
            return (Criteria) this;
        }

        public Criteria andGroFullnameNotEqualTo(String value) {
            addCriterion("gro_fullname <>", value, "groFullname");
            return (Criteria) this;
        }

        public Criteria andGroFullnameGreaterThan(String value) {
            addCriterion("gro_fullname >", value, "groFullname");
            return (Criteria) this;
        }

        public Criteria andGroFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("gro_fullname >=", value, "groFullname");
            return (Criteria) this;
        }

        public Criteria andGroFullnameLessThan(String value) {
            addCriterion("gro_fullname <", value, "groFullname");
            return (Criteria) this;
        }

        public Criteria andGroFullnameLessThanOrEqualTo(String value) {
            addCriterion("gro_fullname <=", value, "groFullname");
            return (Criteria) this;
        }

        public Criteria andGroFullnameLike(String value) {
            addCriterion("gro_fullname like", value, "groFullname");
            return (Criteria) this;
        }

        public Criteria andGroFullnameNotLike(String value) {
            addCriterion("gro_fullname not like", value, "groFullname");
            return (Criteria) this;
        }

        public Criteria andGroFullnameIn(List<String> values) {
            addCriterion("gro_fullname in", values, "groFullname");
            return (Criteria) this;
        }

        public Criteria andGroFullnameNotIn(List<String> values) {
            addCriterion("gro_fullname not in", values, "groFullname");
            return (Criteria) this;
        }

        public Criteria andGroFullnameBetween(String value1, String value2) {
            addCriterion("gro_fullname between", value1, value2, "groFullname");
            return (Criteria) this;
        }

        public Criteria andGroFullnameNotBetween(String value1, String value2) {
            addCriterion("gro_fullname not between", value1, value2, "groFullname");
            return (Criteria) this;
        }

        public Criteria andGroOrgCodeIsNull() {
            addCriterion("gro_org_code is null");
            return (Criteria) this;
        }

        public Criteria andGroOrgCodeIsNotNull() {
            addCriterion("gro_org_code is not null");
            return (Criteria) this;
        }

        public Criteria andGroOrgCodeEqualTo(String value) {
            addCriterion("gro_org_code =", value, "groOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroOrgCodeNotEqualTo(String value) {
            addCriterion("gro_org_code <>", value, "groOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroOrgCodeGreaterThan(String value) {
            addCriterion("gro_org_code >", value, "groOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("gro_org_code >=", value, "groOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroOrgCodeLessThan(String value) {
            addCriterion("gro_org_code <", value, "groOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("gro_org_code <=", value, "groOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroOrgCodeLike(String value) {
            addCriterion("gro_org_code like", value, "groOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroOrgCodeNotLike(String value) {
            addCriterion("gro_org_code not like", value, "groOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroOrgCodeIn(List<String> values) {
            addCriterion("gro_org_code in", values, "groOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroOrgCodeNotIn(List<String> values) {
            addCriterion("gro_org_code not in", values, "groOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroOrgCodeBetween(String value1, String value2) {
            addCriterion("gro_org_code between", value1, value2, "groOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroOrgCodeNotBetween(String value1, String value2) {
            addCriterion("gro_org_code not between", value1, value2, "groOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroPinyinIsNull() {
            addCriterion("gro_pinyin is null");
            return (Criteria) this;
        }

        public Criteria andGroPinyinIsNotNull() {
            addCriterion("gro_pinyin is not null");
            return (Criteria) this;
        }

        public Criteria andGroPinyinEqualTo(String value) {
            addCriterion("gro_pinyin =", value, "groPinyin");
            return (Criteria) this;
        }

        public Criteria andGroPinyinNotEqualTo(String value) {
            addCriterion("gro_pinyin <>", value, "groPinyin");
            return (Criteria) this;
        }

        public Criteria andGroPinyinGreaterThan(String value) {
            addCriterion("gro_pinyin >", value, "groPinyin");
            return (Criteria) this;
        }

        public Criteria andGroPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("gro_pinyin >=", value, "groPinyin");
            return (Criteria) this;
        }

        public Criteria andGroPinyinLessThan(String value) {
            addCriterion("gro_pinyin <", value, "groPinyin");
            return (Criteria) this;
        }

        public Criteria andGroPinyinLessThanOrEqualTo(String value) {
            addCriterion("gro_pinyin <=", value, "groPinyin");
            return (Criteria) this;
        }

        public Criteria andGroPinyinLike(String value) {
            addCriterion("gro_pinyin like", value, "groPinyin");
            return (Criteria) this;
        }

        public Criteria andGroPinyinNotLike(String value) {
            addCriterion("gro_pinyin not like", value, "groPinyin");
            return (Criteria) this;
        }

        public Criteria andGroPinyinIn(List<String> values) {
            addCriterion("gro_pinyin in", values, "groPinyin");
            return (Criteria) this;
        }

        public Criteria andGroPinyinNotIn(List<String> values) {
            addCriterion("gro_pinyin not in", values, "groPinyin");
            return (Criteria) this;
        }

        public Criteria andGroPinyinBetween(String value1, String value2) {
            addCriterion("gro_pinyin between", value1, value2, "groPinyin");
            return (Criteria) this;
        }

        public Criteria andGroPinyinNotBetween(String value1, String value2) {
            addCriterion("gro_pinyin not between", value1, value2, "groPinyin");
            return (Criteria) this;
        }

        public Criteria andGroRepOrgCodeIsNull() {
            addCriterion("gro_rep_org_code is null");
            return (Criteria) this;
        }

        public Criteria andGroRepOrgCodeIsNotNull() {
            addCriterion("gro_rep_org_code is not null");
            return (Criteria) this;
        }

        public Criteria andGroRepOrgCodeEqualTo(String value) {
            addCriterion("gro_rep_org_code =", value, "groRepOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroRepOrgCodeNotEqualTo(String value) {
            addCriterion("gro_rep_org_code <>", value, "groRepOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroRepOrgCodeGreaterThan(String value) {
            addCriterion("gro_rep_org_code >", value, "groRepOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroRepOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("gro_rep_org_code >=", value, "groRepOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroRepOrgCodeLessThan(String value) {
            addCriterion("gro_rep_org_code <", value, "groRepOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroRepOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("gro_rep_org_code <=", value, "groRepOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroRepOrgCodeLike(String value) {
            addCriterion("gro_rep_org_code like", value, "groRepOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroRepOrgCodeNotLike(String value) {
            addCriterion("gro_rep_org_code not like", value, "groRepOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroRepOrgCodeIn(List<String> values) {
            addCriterion("gro_rep_org_code in", values, "groRepOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroRepOrgCodeNotIn(List<String> values) {
            addCriterion("gro_rep_org_code not in", values, "groRepOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroRepOrgCodeBetween(String value1, String value2) {
            addCriterion("gro_rep_org_code between", value1, value2, "groRepOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroRepOrgCodeNotBetween(String value1, String value2) {
            addCriterion("gro_rep_org_code not between", value1, value2, "groRepOrgCode");
            return (Criteria) this;
        }

        public Criteria andGroRemarksIsNull() {
            addCriterion("gro_remarks is null");
            return (Criteria) this;
        }

        public Criteria andGroRemarksIsNotNull() {
            addCriterion("gro_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andGroRemarksEqualTo(String value) {
            addCriterion("gro_remarks =", value, "groRemarks");
            return (Criteria) this;
        }

        public Criteria andGroRemarksNotEqualTo(String value) {
            addCriterion("gro_remarks <>", value, "groRemarks");
            return (Criteria) this;
        }

        public Criteria andGroRemarksGreaterThan(String value) {
            addCriterion("gro_remarks >", value, "groRemarks");
            return (Criteria) this;
        }

        public Criteria andGroRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("gro_remarks >=", value, "groRemarks");
            return (Criteria) this;
        }

        public Criteria andGroRemarksLessThan(String value) {
            addCriterion("gro_remarks <", value, "groRemarks");
            return (Criteria) this;
        }

        public Criteria andGroRemarksLessThanOrEqualTo(String value) {
            addCriterion("gro_remarks <=", value, "groRemarks");
            return (Criteria) this;
        }

        public Criteria andGroRemarksLike(String value) {
            addCriterion("gro_remarks like", value, "groRemarks");
            return (Criteria) this;
        }

        public Criteria andGroRemarksNotLike(String value) {
            addCriterion("gro_remarks not like", value, "groRemarks");
            return (Criteria) this;
        }

        public Criteria andGroRemarksIn(List<String> values) {
            addCriterion("gro_remarks in", values, "groRemarks");
            return (Criteria) this;
        }

        public Criteria andGroRemarksNotIn(List<String> values) {
            addCriterion("gro_remarks not in", values, "groRemarks");
            return (Criteria) this;
        }

        public Criteria andGroRemarksBetween(String value1, String value2) {
            addCriterion("gro_remarks between", value1, value2, "groRemarks");
            return (Criteria) this;
        }

        public Criteria andGroRemarksNotBetween(String value1, String value2) {
            addCriterion("gro_remarks not between", value1, value2, "groRemarks");
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