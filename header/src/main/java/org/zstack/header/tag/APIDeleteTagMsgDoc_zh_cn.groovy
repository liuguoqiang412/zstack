package org.zstack.header.tag



doc {
    title "在这里填写API标题"

    desc "在这里填写API描述"

    rest {
        request {
            url "DELETE /v1/tags/{uuid}"

            header (OAuth: 'the-session-uuid')

            clz APIDeleteTagMsg.class

            desc ""
            
			params {

				column {
					name "uuid"
					enclosedIn ""
					desc "资源的UUID，唯一标示该资源"
					inUrl true
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "deleteMode"
					enclosedIn ""
					desc ""
					inUrl false
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "systemTags"
					enclosedIn ""
					desc ""
					inUrl false
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "userTags"
					enclosedIn ""
					desc ""
					inUrl false
					type "List"
					optional true
					since "0.6"
					
				}
			}
        }

        response {
            clz APIDeleteTagEvent.class
        }
    }
}