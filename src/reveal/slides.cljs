(ns reveal.slides)


(def ^:private argument
  [:div.argument
   [:i.mr.statement.fas.fa-circle {:data-id "premise"}]
   [:i.mr.pro.fas.fa-long-arrow-alt-right {:data-id "relation"}]
   [:i.statement.fas.fa-circle {:data-id "conclusion"}]])

(def slide-auto-animate
  [:section
   [:section {:data-auto-animate "data-auto-animate"}
    [:h2 "Auto Animate"]
    [:p "Automatically animate CSS / SVGs on a slide"
     [:small "Press " [:code "space"] " for next animation step"]]
    (last argument)]
   [:section {:data-auto-animate "data-auto-animate"}
    argument]
   [:section {:data-auto-animate "data-auto-animate"}
    [:i.statement.fas.fa-circle {:data-id "conclusion"}]
    [:div.row
     [:div.offset-4.col-2
      [:i.relation.pro.fas.fa-long-arrow-alt-right {:data-id "relation" :data-fa-transform "rotate--40"}]]
     [:div.col-2
      [:i.relation.con.fas.fa-long-arrow-alt-left {:data-id "relation-con" :data-fa-transform "rotate-40"}]]]
    [:div.row
     [:div.offset-3.col-2
      [:i.statement.fas.fa-circle {:data-id "premise"}]]
     [:div.offset-2.col-2
      [:i.statement.fas.fa-circle {:data-id "premise-con"}]]]]
   [:section {:data-auto-animate "data-auto-animate"}
    [:div.row
     [:div.col-12
      [:i.issue.fas.fa-circle {:data-id "issue"}]]]
    [:div.row
     [:div.col-12
      [:i.relation.issue.fas.fa-long-arrow-alt-up {:data-id "relation-position"}]]]
    [:div.row
     [:div.col-12
      [:i.statement.fas.fa-circle {:data-id "conclusion"}]]]
    [:div.row
     [:div.offset-4.col-2
      [:i.relation.pro.fas.fa-long-arrow-alt-right {:data-id "relation" :data-fa-transform "rotate--40"}]]
     [:div.col-2
      [:i.relation.con.fas.fa-long-arrow-alt-left {:data-id "relation-con" :data-fa-transform "rotate-40"}]]]
    [:div.row
     [:div.offset-3.col-2
      [:i.statement.fas.fa-circle {:data-id "premise"}]]
     [:div.offset-2.col-2
      [:i.statement.fas.fa-circle {:data-id "premise-con"}]]]]])


;; -----------------------------------------------------------------------------

(def title-slide
  [:section
   [:h1 "Developers aren't paid to code"]
   [:div.image-placeholder "Robot and human figures side by side"]
   [:p "Wesley Matson - Clojure Conj 2024"]])

(def golden-age-slide
  [:section
   [:h2 "The Golden Age of Engineering"]
   [:div.timeline
    [:div.timeline-item
     [:div.year "1950s"]
     [:div.description "Manual memory management"]]
    [:div.timeline-item
     [:div.year "1970s"]
     [:div.description "Low-level socket programming"]]
    [:div.timeline-item
     [:div.year "1990s"]
     [:div.description "Manual UI layout and event handling"]]
    [:div.timeline-item
     [:div.year "2000s"]
     [:div.description "XML"]]
    [:div.timeline-item
     [:div.year "2010s"]
     [:div.description "Boilerplate REST API development"]]
    [:div.timeline-item.highlight
     [:div.year "2020s"]
     [:div.description "Data plumbing"]]
    [:div.timeline-item.future
     [:div.year "Future"]
     [:div.description "?"]]]])

(def valuable-qualities-slides
  [:section
   [:section
    [:h2 "Valuable Qualities in the Age of Automation"]
    [:h3 "Systems Thinking"]
    [:div.system-diagram
     [:div.circle "Code"]
     [:div.circle "Business"]
     [:div.circle "Users"]
     [:div.circle "Infrastructure"]]]
   [:section
    [:h3 "Problem-Solving Beyond Code"]
    [:div.columns
     [:div.column
      [:h4 "Technical Solutions"]
      [:ul
       [:li "Algorithms"]
       [:li "Data structures"]
       [:li "Architecture"]]]
     [:div.column
      [:h4 "Non-Technical Solutions"]
      [:ul
       [:li "Process improvements"]
       [:li "User education"]
       [:li "Policy changes"]]]]]
   [:section
    [:h3 "Communication and Empathy"]
    [:div.image-placeholder "Diverse team collaborating (stick figures)"]]
   [:section
    [:h3 "Adaptability and Quick Learning"]
    [:div.image-placeholder "Person juggling different tools or hats"]]])

(def practical-applications-slide
  [:section
   [:h2 "Practical Applications"]
   [:div.before-after
    [:div.before
     [:h4 "Before"]
     [:div.image-placeholder "Simplified system design (before)"]]
    [:div.after
     [:h4 "After"]
     [:div.image-placeholder "Improved system design (after)"]]]])

(def conclusion-slide
  [:section
   [:blockquote.large
    "The best way to predict the future is to invent it."]
   [:p.author "- Alan Kay"]
   [:aside.notes "The google AI gave me an image of Hitler alongside this quote, so do make sure to check your AI partner's work"]])

;; Update the `all` function to include the new slides
(defn all
  "Add here all slides you want to see in your presentation."
  []
  [title-slide
   golden-age-slide
   valuable-qualities-slides
   practical-applications-slide
   conclusion-slide])
