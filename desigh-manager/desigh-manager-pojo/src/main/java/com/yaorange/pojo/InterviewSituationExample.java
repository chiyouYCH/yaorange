package com.yaorange.pojo;

import java.util.ArrayList;
import java.util.List;

public class InterviewSituationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterviewSituationExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNull() {
            addCriterion("studentId is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("studentId is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(Integer value) {
            addCriterion("studentId =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(Integer value) {
            addCriterion("studentId <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(Integer value) {
            addCriterion("studentId >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentId >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(Integer value) {
            addCriterion("studentId <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(Integer value) {
            addCriterion("studentId <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<Integer> values) {
            addCriterion("studentId in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<Integer> values) {
            addCriterion("studentId not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(Integer value1, Integer value2) {
            addCriterion("studentId between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(Integer value1, Integer value2) {
            addCriterion("studentId not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andInterviewcompanyIsNull() {
            addCriterion("interviewCompany is null");
            return (Criteria) this;
        }

        public Criteria andInterviewcompanyIsNotNull() {
            addCriterion("interviewCompany is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewcompanyEqualTo(String value) {
            addCriterion("interviewCompany =", value, "interviewcompany");
            return (Criteria) this;
        }

        public Criteria andInterviewcompanyNotEqualTo(String value) {
            addCriterion("interviewCompany <>", value, "interviewcompany");
            return (Criteria) this;
        }

        public Criteria andInterviewcompanyGreaterThan(String value) {
            addCriterion("interviewCompany >", value, "interviewcompany");
            return (Criteria) this;
        }

        public Criteria andInterviewcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("interviewCompany >=", value, "interviewcompany");
            return (Criteria) this;
        }

        public Criteria andInterviewcompanyLessThan(String value) {
            addCriterion("interviewCompany <", value, "interviewcompany");
            return (Criteria) this;
        }

        public Criteria andInterviewcompanyLessThanOrEqualTo(String value) {
            addCriterion("interviewCompany <=", value, "interviewcompany");
            return (Criteria) this;
        }

        public Criteria andInterviewcompanyLike(String value) {
            addCriterion("interviewCompany like", value, "interviewcompany");
            return (Criteria) this;
        }

        public Criteria andInterviewcompanyNotLike(String value) {
            addCriterion("interviewCompany not like", value, "interviewcompany");
            return (Criteria) this;
        }

        public Criteria andInterviewcompanyIn(List<String> values) {
            addCriterion("interviewCompany in", values, "interviewcompany");
            return (Criteria) this;
        }

        public Criteria andInterviewcompanyNotIn(List<String> values) {
            addCriterion("interviewCompany not in", values, "interviewcompany");
            return (Criteria) this;
        }

        public Criteria andInterviewcompanyBetween(String value1, String value2) {
            addCriterion("interviewCompany between", value1, value2, "interviewcompany");
            return (Criteria) this;
        }

        public Criteria andInterviewcompanyNotBetween(String value1, String value2) {
            addCriterion("interviewCompany not between", value1, value2, "interviewcompany");
            return (Criteria) this;
        }

        public Criteria andEnclosure1IsNull() {
            addCriterion("enclosure1 is null");
            return (Criteria) this;
        }

        public Criteria andEnclosure1IsNotNull() {
            addCriterion("enclosure1 is not null");
            return (Criteria) this;
        }

        public Criteria andEnclosure1EqualTo(String value) {
            addCriterion("enclosure1 =", value, "enclosure1");
            return (Criteria) this;
        }

        public Criteria andEnclosure1NotEqualTo(String value) {
            addCriterion("enclosure1 <>", value, "enclosure1");
            return (Criteria) this;
        }

        public Criteria andEnclosure1GreaterThan(String value) {
            addCriterion("enclosure1 >", value, "enclosure1");
            return (Criteria) this;
        }

        public Criteria andEnclosure1GreaterThanOrEqualTo(String value) {
            addCriterion("enclosure1 >=", value, "enclosure1");
            return (Criteria) this;
        }

        public Criteria andEnclosure1LessThan(String value) {
            addCriterion("enclosure1 <", value, "enclosure1");
            return (Criteria) this;
        }

        public Criteria andEnclosure1LessThanOrEqualTo(String value) {
            addCriterion("enclosure1 <=", value, "enclosure1");
            return (Criteria) this;
        }

        public Criteria andEnclosure1Like(String value) {
            addCriterion("enclosure1 like", value, "enclosure1");
            return (Criteria) this;
        }

        public Criteria andEnclosure1NotLike(String value) {
            addCriterion("enclosure1 not like", value, "enclosure1");
            return (Criteria) this;
        }

        public Criteria andEnclosure1In(List<String> values) {
            addCriterion("enclosure1 in", values, "enclosure1");
            return (Criteria) this;
        }

        public Criteria andEnclosure1NotIn(List<String> values) {
            addCriterion("enclosure1 not in", values, "enclosure1");
            return (Criteria) this;
        }

        public Criteria andEnclosure1Between(String value1, String value2) {
            addCriterion("enclosure1 between", value1, value2, "enclosure1");
            return (Criteria) this;
        }

        public Criteria andEnclosure1NotBetween(String value1, String value2) {
            addCriterion("enclosure1 not between", value1, value2, "enclosure1");
            return (Criteria) this;
        }

        public Criteria andEnclosure2IsNull() {
            addCriterion("enclosure2 is null");
            return (Criteria) this;
        }

        public Criteria andEnclosure2IsNotNull() {
            addCriterion("enclosure2 is not null");
            return (Criteria) this;
        }

        public Criteria andEnclosure2EqualTo(String value) {
            addCriterion("enclosure2 =", value, "enclosure2");
            return (Criteria) this;
        }

        public Criteria andEnclosure2NotEqualTo(String value) {
            addCriterion("enclosure2 <>", value, "enclosure2");
            return (Criteria) this;
        }

        public Criteria andEnclosure2GreaterThan(String value) {
            addCriterion("enclosure2 >", value, "enclosure2");
            return (Criteria) this;
        }

        public Criteria andEnclosure2GreaterThanOrEqualTo(String value) {
            addCriterion("enclosure2 >=", value, "enclosure2");
            return (Criteria) this;
        }

        public Criteria andEnclosure2LessThan(String value) {
            addCriterion("enclosure2 <", value, "enclosure2");
            return (Criteria) this;
        }

        public Criteria andEnclosure2LessThanOrEqualTo(String value) {
            addCriterion("enclosure2 <=", value, "enclosure2");
            return (Criteria) this;
        }

        public Criteria andEnclosure2Like(String value) {
            addCriterion("enclosure2 like", value, "enclosure2");
            return (Criteria) this;
        }

        public Criteria andEnclosure2NotLike(String value) {
            addCriterion("enclosure2 not like", value, "enclosure2");
            return (Criteria) this;
        }

        public Criteria andEnclosure2In(List<String> values) {
            addCriterion("enclosure2 in", values, "enclosure2");
            return (Criteria) this;
        }

        public Criteria andEnclosure2NotIn(List<String> values) {
            addCriterion("enclosure2 not in", values, "enclosure2");
            return (Criteria) this;
        }

        public Criteria andEnclosure2Between(String value1, String value2) {
            addCriterion("enclosure2 between", value1, value2, "enclosure2");
            return (Criteria) this;
        }

        public Criteria andEnclosure2NotBetween(String value1, String value2) {
            addCriterion("enclosure2 not between", value1, value2, "enclosure2");
            return (Criteria) this;
        }

        public Criteria andSoundrecordingIsNull() {
            addCriterion("soundRecording is null");
            return (Criteria) this;
        }

        public Criteria andSoundrecordingIsNotNull() {
            addCriterion("soundRecording is not null");
            return (Criteria) this;
        }

        public Criteria andSoundrecordingEqualTo(String value) {
            addCriterion("soundRecording =", value, "soundrecording");
            return (Criteria) this;
        }

        public Criteria andSoundrecordingNotEqualTo(String value) {
            addCriterion("soundRecording <>", value, "soundrecording");
            return (Criteria) this;
        }

        public Criteria andSoundrecordingGreaterThan(String value) {
            addCriterion("soundRecording >", value, "soundrecording");
            return (Criteria) this;
        }

        public Criteria andSoundrecordingGreaterThanOrEqualTo(String value) {
            addCriterion("soundRecording >=", value, "soundrecording");
            return (Criteria) this;
        }

        public Criteria andSoundrecordingLessThan(String value) {
            addCriterion("soundRecording <", value, "soundrecording");
            return (Criteria) this;
        }

        public Criteria andSoundrecordingLessThanOrEqualTo(String value) {
            addCriterion("soundRecording <=", value, "soundrecording");
            return (Criteria) this;
        }

        public Criteria andSoundrecordingLike(String value) {
            addCriterion("soundRecording like", value, "soundrecording");
            return (Criteria) this;
        }

        public Criteria andSoundrecordingNotLike(String value) {
            addCriterion("soundRecording not like", value, "soundrecording");
            return (Criteria) this;
        }

        public Criteria andSoundrecordingIn(List<String> values) {
            addCriterion("soundRecording in", values, "soundrecording");
            return (Criteria) this;
        }

        public Criteria andSoundrecordingNotIn(List<String> values) {
            addCriterion("soundRecording not in", values, "soundrecording");
            return (Criteria) this;
        }

        public Criteria andSoundrecordingBetween(String value1, String value2) {
            addCriterion("soundRecording between", value1, value2, "soundrecording");
            return (Criteria) this;
        }

        public Criteria andSoundrecordingNotBetween(String value1, String value2) {
            addCriterion("soundRecording not between", value1, value2, "soundrecording");
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