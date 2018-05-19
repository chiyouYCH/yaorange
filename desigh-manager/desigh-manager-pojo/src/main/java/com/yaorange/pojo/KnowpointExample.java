package com.yaorange.pojo;

import java.util.ArrayList;
import java.util.List;

public class KnowpointExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KnowpointExample() {
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

        public Criteria andKnowpointiIdIsNull() {
            addCriterion("knowpointI_id is null");
            return (Criteria) this;
        }

        public Criteria andKnowpointiIdIsNotNull() {
            addCriterion("knowpointI_id is not null");
            return (Criteria) this;
        }

        public Criteria andKnowpointiIdEqualTo(Integer value) {
            addCriterion("knowpointI_id =", value, "knowpointiId");
            return (Criteria) this;
        }

        public Criteria andKnowpointiIdNotEqualTo(Integer value) {
            addCriterion("knowpointI_id <>", value, "knowpointiId");
            return (Criteria) this;
        }

        public Criteria andKnowpointiIdGreaterThan(Integer value) {
            addCriterion("knowpointI_id >", value, "knowpointiId");
            return (Criteria) this;
        }

        public Criteria andKnowpointiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("knowpointI_id >=", value, "knowpointiId");
            return (Criteria) this;
        }

        public Criteria andKnowpointiIdLessThan(Integer value) {
            addCriterion("knowpointI_id <", value, "knowpointiId");
            return (Criteria) this;
        }

        public Criteria andKnowpointiIdLessThanOrEqualTo(Integer value) {
            addCriterion("knowpointI_id <=", value, "knowpointiId");
            return (Criteria) this;
        }

        public Criteria andKnowpointiIdIn(List<Integer> values) {
            addCriterion("knowpointI_id in", values, "knowpointiId");
            return (Criteria) this;
        }

        public Criteria andKnowpointiIdNotIn(List<Integer> values) {
            addCriterion("knowpointI_id not in", values, "knowpointiId");
            return (Criteria) this;
        }

        public Criteria andKnowpointiIdBetween(Integer value1, Integer value2) {
            addCriterion("knowpointI_id between", value1, value2, "knowpointiId");
            return (Criteria) this;
        }

        public Criteria andKnowpointiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("knowpointI_id not between", value1, value2, "knowpointiId");
            return (Criteria) this;
        }

        public Criteria andKnowpointNameIsNull() {
            addCriterion("knowpoint_name is null");
            return (Criteria) this;
        }

        public Criteria andKnowpointNameIsNotNull() {
            addCriterion("knowpoint_name is not null");
            return (Criteria) this;
        }

        public Criteria andKnowpointNameEqualTo(String value) {
            addCriterion("knowpoint_name =", value, "knowpointName");
            return (Criteria) this;
        }

        public Criteria andKnowpointNameNotEqualTo(String value) {
            addCriterion("knowpoint_name <>", value, "knowpointName");
            return (Criteria) this;
        }

        public Criteria andKnowpointNameGreaterThan(String value) {
            addCriterion("knowpoint_name >", value, "knowpointName");
            return (Criteria) this;
        }

        public Criteria andKnowpointNameGreaterThanOrEqualTo(String value) {
            addCriterion("knowpoint_name >=", value, "knowpointName");
            return (Criteria) this;
        }

        public Criteria andKnowpointNameLessThan(String value) {
            addCriterion("knowpoint_name <", value, "knowpointName");
            return (Criteria) this;
        }

        public Criteria andKnowpointNameLessThanOrEqualTo(String value) {
            addCriterion("knowpoint_name <=", value, "knowpointName");
            return (Criteria) this;
        }

        public Criteria andKnowpointNameLike(String value) {
            addCriterion("knowpoint_name like", value, "knowpointName");
            return (Criteria) this;
        }

        public Criteria andKnowpointNameNotLike(String value) {
            addCriterion("knowpoint_name not like", value, "knowpointName");
            return (Criteria) this;
        }

        public Criteria andKnowpointNameIn(List<String> values) {
            addCriterion("knowpoint_name in", values, "knowpointName");
            return (Criteria) this;
        }

        public Criteria andKnowpointNameNotIn(List<String> values) {
            addCriterion("knowpoint_name not in", values, "knowpointName");
            return (Criteria) this;
        }

        public Criteria andKnowpointNameBetween(String value1, String value2) {
            addCriterion("knowpoint_name between", value1, value2, "knowpointName");
            return (Criteria) this;
        }

        public Criteria andKnowpointNameNotBetween(String value1, String value2) {
            addCriterion("knowpoint_name not between", value1, value2, "knowpointName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
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