package org.zstack.header.storage.primary



doc {
    title "在这里填写API标题"

    desc "在这里填写API描述"

    rest {
        request {
            url "POST /v1/clusters/{clusterUuid}/primary-storage/{primaryStorageUuid}"

            header (OAuth: 'the-session-uuid')

            clz APIAttachPrimaryStorageToClusterMsg.class

            desc ""
            
			params {

				column {
					name "clusterUuid"
					enclosedIn ""
					desc "集群UUID"
					inUrl true
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "primaryStorageUuid"
					enclosedIn ""
					desc "主存储UUID"
					inUrl true
					type "String"
					optional false
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
            clz APIAttachPrimaryStorageToClusterEvent.class
        }
    }
}