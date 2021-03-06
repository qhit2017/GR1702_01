USE [db_worker]
GO
/****** Object:  Table [dbo].[db_worker2]    Script Date: 12/17/2017 19:40:58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[db_worker2](
	[id] [int] NOT NULL,
	[name] [nvarchar](1) NOT NULL,
	[salary] [money] NOT NULL,
	[deteline] [date] NOT NULL,
	[recommend] [bit] NOT NULL,
	[department] [nvarchar](1) NOT NULL,
	[remark] [ntext] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Default [DF__db_worker__salar__014935CB]    Script Date: 12/17/2017 19:40:58 ******/
ALTER TABLE [dbo].[db_worker2] ADD  DEFAULT ((5000)) FOR [salary]
GO
