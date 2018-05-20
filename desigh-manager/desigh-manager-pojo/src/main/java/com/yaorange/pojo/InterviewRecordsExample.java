package com.yaorange.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InterviewRecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterviewRecordsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andInterviewplaceIsNull() {
            addCriterion("interviewPlace is null");
            return (Criteria) this;
        }

        public Criteria andInterviewplaceIsNotNull() {
            addCriterion("interviewPlace is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewplaceEqualTo(String value) {
            addCriterion("interviewPlace =", value, "interviewplace");
            return (Criteria) this;
        }

        public Criteria andInterviewplaceNotEqualTo(String value) {
            addCriterion("interviewPlace <>", value, "interviewplace");
            return (Criteria) this;
        }

        public Criteria andInterviewplaceGreaterThan(String value) {
            addCriterion("interviewPlace >", value, "interviewplace");
            return (Criteria) this;
        }

        public Criteria andInterviewplaceGreaterThanOrEqualTo(String value) {
            addCriterion("interviewPlace >=", value, "interviewplace");
            return (Criteria) this;
        }

        public Criteria andInterviewplaceLessThan(String value) {
            addCriterion("interviewPlace <", value, "interviewplace");
            return (Criteria) this;
        }

        public Criteria andInterviewplaceLessThanOrEqualTo(String value) {
            addCriterion("interviewPlace <=", value, "interviewplace");
            return (Criteria) this;
        }

        public Criteria andInterviewplaceLike(String value) {
            addCriterion("interviewPlace like", value, "interviewplace");
            return (Criteria) this;
        }

        public Criteria andInterviewplaceNotLike(String value) {
            addCriterion("interviewPlace not like", value, "interviewplace");
            return (Criteria) this;
        }

        public Criteria andInterviewplaceIn(List<String> values) {
            addCriterion("interviewPlace in", values, "interviewplace");
            return (Criteria) this;
        }

        public Criteria andInterviewplaceNotIn(List<String> values) {
            addCriterion("interviewPlace not in", values, "interviewplace");
            return (Criteria) this;
        }

        public Criteria andInterviewplaceBetween(String value1, String value2) {
            addCriterion("interviewPlace between", value1, value2, "interviewplace");
            return (Criteria) this;
        }

        public Criteria andInterviewplaceNotBetween(String value1, String value2) {
            addCriterion("interviewPlace not between", value1, value2, "interviewplace");
            return (Criteria) this;
        }

        public Criteria andContactsIsNull() {
            addCriterion("contacts is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("contacts is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("contacts =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("contacts <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("contacts >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("contacts >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("contacts <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("contacts <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("contacts like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("contacts not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("contacts in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("contacts not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("contacts between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("contacts not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsphoneIsNull() {
            addCriterion("contactsPhone is null");
            return (Criteria) this;
        }

        public Criteria andContactsphoneIsNotNull() {
            addCriterion("contactsPhone is not null");
            return (Criteria) this;
        }

        public Criteria andContactsphoneEqualTo(String value) {
            addCriterion("contactsPhone =", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneNotEqualTo(String value) {
            addCriterion("contactsPhone <>", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneGreaterThan(String value) {
            addCriterion("contactsPhone >", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneGreaterThanOrEqualTo(String value) {
            addCriterion("contactsPhone >=", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneLessThan(String value) {
            addCriterion("contactsPhone <", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneLessThanOrEqualTo(String value) {
            addCriterion("contactsPhone <=", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneLike(String value) {
            addCriterion("contactsPhone like", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneNotLike(String value) {
            addCriterion("contactsPhone not like", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneIn(List<String> values) {
            addCriterion("contactsPhone in", values, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneNotIn(List<String> values) {
            addCriterion("contactsPhone not in", values, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneBetween(String value1, String value2) {
            addCriterion("contactsPhone between", value1, value2, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneNotBetween(String value1, String value2) {
            addCriterion("contactsPhone not between", value1, value2, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeIsNull() {
            addCriterion("interviewTime is null");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeIsNotNull() {
            addCriterion("interviewTime is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeEqualTo(Date value) {
            addCriterionForJDBCDate("interviewTime =", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("interviewTime <>", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("interviewTime >", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("interviewTime >=", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeLessThan(Date value) {
            addCriterionForJDBCDate("interviewTime <", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("interviewTime <=", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeIn(List<Date> values) {
            addCriterionForJDBCDate("interviewTime in", values, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("interviewTime not in", values, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("interviewTime between", value1, value2, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("interviewTime not between", value1, value2, "interviewtime");
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