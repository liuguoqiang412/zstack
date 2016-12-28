package org.zstack.header.vm



doc {
    title "在这里填写API标题"

    desc "在这里填写API描述"

    rest {
        request {
            url "PUT /v1/vm-instances/{uuid}/actions"

            header (OAuth: 'the-session-uuid')

            clz APIUpdateVmInstanceMsg.class

            desc ""
            
			params {

				column {
					name "uuid"
					enclosedIn "updateVmInstance"
					desc "资源的UUID，唯一标示该资源"
					inUrl true
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "name"
					enclosedIn "updateVmInstance"
					desc "资源名称"
					inUrl false
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "description"
					enclosedIn "updateVmInstance"
					desc "资源的详细描述"
					inUrl false
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "state"
					enclosedIn "updateVmInstance"
					desc ""
					inUrl false
					type "String"
					optional true
					since "0.6"
					values ("Stopped","Running")
				}
				column {
					name "defaultL3NetworkUuid"
					enclosedIn "updateVmInstance"
					desc ""
					inUrl false
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "platform"
					enclosedIn "updateVmInstance"
					desc ""
					inUrl false
					type "String"
					optional true
					since "0.6"
					values ("Linux","Windows","Other","Paravirtualization","WindowsVirtio")
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
            clz APIUpdateVmInstanceEvent.class
        }
    }
}